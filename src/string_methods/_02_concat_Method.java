package string_methods;

public class _02_concat_Method {
    public static void main(String[] args) {
        /*
        1. if you are able to put the result into another variable == return type , returns a string
        2. is non-static (static = classname.something() , non-static = object.something()
        3. takes one argument
         */
        String str1 = "Tech";
        String str2 = "Global";

        String str3 = str1.concat(str2); // false
        String str4 = str1.concat(str3); // false


        System.out.println(str3);


    }
}
