package strings;

public class StringPractice {
    public static void stringQuestions() {

        // ? check == vs equals()
        String s1 = new String("hello");
        String s2 = "hello".intern();
        String s3 = "hello".intern();
        // System.out.println("check with == " + s1 == s2);
        System.out.println("check with == s2 s3 " + s2 == s3);

        // System.out.println("check with equals-->"+ s1.equals(s2));

        // ? String intern() Method
        String str = new String("Welcome to JavaTpoint").intern(); // statement - 1
        String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2
        System.out.println(str1 == str); // prints true

        

    }
}
