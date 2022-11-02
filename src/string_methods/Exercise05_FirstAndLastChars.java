package string_methods;

import java.util.Scanner;

public class Exercise05_FirstAndLastChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = input.nextLine();
        System.out.println("First character is = " + name.charAt(0));
        System.out.println("Last character is = " + name.charAt(name.length() - 1));
    }
}
