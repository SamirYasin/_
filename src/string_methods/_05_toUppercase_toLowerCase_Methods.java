package string_methods;

public class _05_toUppercase_toLowerCase_Methods {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a string
        3. non-static
        4. the one we use does not take any arguments - there are overloaded methods
         */
        String name = "John";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println("ab".toUpperCase().concat("xY".toLowerCase()).toLowerCase());
    }
}
