package string_methods;

import java.util.Scanner;

public class Exercise01_StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 strings");
        String str1 = input.nextLine(), str2 = input.nextLine();
        /*
        if(str1.equals(str2)){
            System.out.println("These strings are equal");
        }
        else{
            System.out.println("These strings are not equal");
        }

         */
        String result = str1.equals(str2) ? "these strings are equal" : "these strings are not equal";
        System.out.println(result);



    }
}
