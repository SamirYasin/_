package string_methods;

import java.util.Scanner;

public class Exercise06_MiddleCharOrChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name:");
        String name = input.nextLine();
        if(name.length() % 2 == 0){
            System.out.println("The middle characters are = " + name.substring(name.length()/2 -1, name.length()/2 + 1));
        } else{
            System.out.println("The middle character is = " + name.substring(name.length()/2, name.length()/2 + 1));
        }


    }
}
