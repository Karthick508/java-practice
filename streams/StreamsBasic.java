package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import employeedata.Employee;

public class StreamsBasic {

    public static void main(String[] args) {
        Basic basicStream = new Basic();
        List<Employee> employeeList = new Employee().getEmployeesData();

        // employeeList.sort((e1, e2) -> e1.getFirstName().compareTo(e2.getLastName()));
        // employeeList.sort(Comparator.comparing(Employee::getAge).reversed());
        basicStream.filterEmployeeByAge(employeeList, 39);
        basicStream.getUniqueDepartments(employeeList);
        basicStream.getHighestSalary(employeeList);
        basicStream.getAverageSalary(employeeList);
        basicStream.getGroupByDepartment(employeeList);
        basicStream.checkAgePermission(employeeList, 100);
        basicStream.findAnyEmployeeFromDepartment(employeeList, "Support");
        basicStream.groupByDepartmentCount(employeeList);
        basicStream.employeesEmailAlphabetical(employeeList);
        basicStream.getSumOfAllSalaries(employeeList);
    }
}

class Basic {
    // ! 1. Filter Employees Over a Certain Age
    List<Employee> filterEmployeeByAge(List<Employee> employees, int age) {
        List<Employee> filteredEmployee = employees.stream().filter(employee -> employee.getAge() > age).toList();
        return filteredEmployee;
    }

    // ! 2.Use Java Streams to extract a list of all unique departments from the
    // employees.
    List<String> getUniqueDepartments(List<Employee> employees) {
        List<String> departments = employees.stream().map(Employee::getDepartment).distinct().toList();
        return departments;
    };

    // ! 3. Find the Employee with the Highest Salary
    Optional<Employee> getHighestSalary(List<Employee> employees) {
        Optional<Employee> highestSalary = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        return highestSalary;
    };

    // ! 4. Calculate the Average Salary of Employees
    Optional<Double> getAverageSalary(List<Employee> employeesList) {
        Optional<Double> average = Optional
                .of(employeesList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0));
        return average;
    }

    // ! 5. Group Employees by Department
    Map<String, List<Employee>> getGroupByDepartment(List<Employee> employeesList) {
        Map<String, List<Employee>> groupByDepartment = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        return groupByDepartment;
    }

    // ! 6. Check if All Employees Are Older Than 20
    Boolean checkAgePermission(List<Employee> employeesList, int age) {
        Boolean permission = employeesList.stream().allMatch(employee -> employee.getAge() > age);
        return permission;
    }

    // ! 7. Find Any Employee from Marketing
    Optional<Employee> findAnyEmployeeFromDepartment(List<Employee> employeesList, String department) {
        Optional<Employee> dep = employeesList.stream().filter(employee -> department.equals(employee.getDepartment()))
                .findFirst();
        return dep;
    }

    // ! 8. Count the Number of Employees in Each Department
    Map<String, Long> groupByDepartmentCount(List<Employee> employeesList) {
        Map<String, Long> groupDepartmentCount = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        return groupDepartmentCount;
    };

    // ! 9. List Employees in Alphabetical Order
    List<Employee> employeesEmailAlphabetical(List<Employee> employeesList) {
        List<Employee> ordered = employeesList.stream().sorted(Comparator.comparing(Employee::getEmail)).toList();
        return ordered;
    };

    // ! 10. Get the Sum of All Salaries
    Double getSumOfAllSalaries(List<Employee> employeesList) {
        Double totalSalary = employeesList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        return totalSalary;
    }
}