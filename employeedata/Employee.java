package employeedata;

import java.util.Arrays;
import java.util.List;

public class Employee {
        private String firstName;
        private String lastName;
        private int age;
        private double salary;
        private String department;
        private String email;
        private String phoneNumber;
        private String address;
        private String hireDate;
        private String position;

        Employee(String firstName, String lastName, int age, double salary, String department, String email,
                        String phoneNumber, String address, String hireDate, String position) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
                this.salary = salary;
                this.department = department;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.address = address;
                this.hireDate = hireDate;
                this.position = position;
        }

        public Employee() {
                // TODO Auto-generated constructor stub
        }

        public String getFirstName() {
                return firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public int getAge() {
                return age;
        }

        public double getSalary() {
                return salary;
        }

        public String getDepartment() {
                return department;
        }

        public String getEmail() {
                return email;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public String getAddress() {
                return address;
        }

        public String getHireDate() {
                return hireDate;
        }

        public String getPosition() {
                return position;
        }

        @Override
        public String toString() {
                return "Employee {" +
                                "First Name='" + firstName + '\'' +
                                ", Last Name='" + lastName + '\'' +
                                ", Age=" + age +
                                ", Salary=" + salary +
                                ", Department='" + department + '\'' +
                                ", Email='" + email + '\'' +
                                ", Phone Number='" + phoneNumber + '\'' +
                                ", Address='" + address + '\'' +
                                ", Hire Date='" + hireDate + '\'' +
                                ", Position='" + position + '\'' +
                                '}';
        }

        public List<Employee> getEmployeesData() {
                return Arrays.asList(
                                new Employee("John", "Doe", 28, 55000.00, "IT", "john.doe@example.com", "123-456-7890",
                                                "123 Main St, City A", "2020-01-15", "Software Engineer"),
                                new Employee("Jane", "Smith", 34, 72000.00, "HR", "jane.smith@example.com",
                                                "321-654-0987",
                                                "456 Elm St, City B", "2018-03-22", "HR Manager"),
                                new Employee("Alice", "Johnson", 26, 48000.00, "Finance", "alice.johnson@example.com",
                                                "111-222-3333",
                                                "789 Pine St, City C", "2021-06-12", "Financial Analyst"),
                                new Employee("Bob", "Brown", 30, 61000.00, "IT", "bob.brown@example.com",
                                                "444-555-6666",
                                                "135 Oak St, City D", "2019-09-05", "System Administrator"),
                                new Employee("Charlie", "Williams", 29, 58000.00, "Sales",
                                                "charlie.williams@example.com",
                                                "777-888-9999",
                                                "246 Maple St, City E", "2020-11-20", "Sales Executive"),
                                new Employee("Daisy", "Miller", 31, 60000.00, "Marketing", "daisy.miller@example.com",
                                                "999-888-7777",
                                                "135 Birch St, City F", "2017-05-18", "Marketing Specialist"),
                                new Employee("Eve", "Davis", 25, 43337000.00, "Support", "eve.davis@example.com",
                                                "123-321-4567",
                                                "124 Cedar St, City G", "2022-01-25", "Support Engineer"),
                                new Employee("Frank", "Garcia", 35, 78000.00, "IT", "frank.garcia@example.com",
                                                "555-444-3333",
                                                "789 Walnut St, City H", "2015-07-11", "IT Manager"),
                                new Employee("Grace", "Martinez", 40, 85000.00, "HR", "grace.martinez@example.com",
                                                "111-222-3334",
                                                "222 Poplar St, City I", "2013-03-14", "HR Director"),
                                new Employee("Hank", "Lopez", 33, 71000.00, "Operations", "hank.lopez@example.com",
                                                "999-333-2222",
                                                "555 Spruce St, City J", "2016-10-01", "Operations Manager"),
                                new Employee("Ivy", "Clark", 27, 49000.00, "Finance", "ivy.clark@example.com",
                                                "444-111-6666",
                                                "888 Redwood St, City K", "2021-03-30", "Junior Accountant"),
                                new Employee("Jack", "Lewis", 36, 75000.00, "IT", "jack.lewis@example.com",
                                                "555-123-4567",
                                                "333 Sycamore St, City L", "2014-06-18", "Senior Developer"),
                                new Employee("Karen", "Walker", 32, 62000.00, "Sales", "karen.walker@example.com",
                                                "888-444-1111",
                                                "999 Ash St, City M", "2018-04-23", "Account Manager"),
                                new Employee("Leo", "Hall", 29, 56000.00, "Marketing", "leo.hall@example.com",
                                                "222-333-4444",
                                                "101 Willow St, City N", "2020-02-14", "Content Creator"),
                                new Employee("Mona", "Allen", 24, 46000.00, "Support", "mona.allen@example.com",
                                                "555-888-2222",
                                                "555 Magnolia St, City O", "2022-07-21", "Support Analyst"),
                                new Employee("Nina", "Young", 38, 82000.00, "IT", "nina.young@example.com",
                                                "666-555-4444",
                                                "888 Fir St, City P", "2012-09-19", "Tech Lead"),
                                new Employee("Oscar", "Hernandez", 41, 87000.00, "HR", "oscar.hernandez@example.com",
                                                "777-444-3333",
                                                "111 Alder St, City Q", "2010-12-02", "HR Consultant"),
                                new Employee("Paul", "King", 28, 54000.00, "Operations", "paul.king@example.com",
                                                "999-123-3211",
                                                "321 Chestnut St, City R", "2019-08-07", "Operations Analyst"),
                                new Employee("Quinn", "Scott", 35, 78000.00, "Finance", "quinn.scott@example.com",
                                                "222-999-5555",
                                                "222 Hickory St, City S", "2017-11-03", "Senior Accountant"),
                                new Employee("Rita", "Green", 30, 60000.00, "Sales", "rita.green@example.com",
                                                "888-666-7777",
                                                "123 Locust St, City T", "2018-05-30", "Sales Manager"));

        }
}
