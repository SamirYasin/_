package string_methods;

public class Exercise04_substring {
    public static void main(String[] args) {
        //Task 1
        /*
        String s1 = "The best is Java";
        String s2 = s1.trim().substring(s1.indexOf('J'), (s1.trim().length()));
        System.out.println(s2);

         */

        //Task 2
        String s1 = "Java is an object-oriented programming language";
        String s2 = s1.substring(s1.indexOf("Java"), (s1.indexOf("Java") + 4));
        String s3 = s1.substring(s1.indexOf("object-oriented"), (s1.indexOf("object-oriented") + 15));
        System.out.println(s2);
        System.out.println(s3);


    }
}
