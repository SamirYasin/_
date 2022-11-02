package scanner_programs;

import java.util.Scanner;

public class FirstScannerProgram {
    public static void main(String[] args) {
        String firstName, lastName;

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        firstName = inputReader.next(); //.next() only takes one word at a time
        inputReader.nextLine();
        System.out.println("Please enter your last name: ");
        lastName = inputReader.nextLine(); //nextLine() reads the whole line

        String fullName = firstName + " " + lastName;
        System.out.println("Oh, so your full name is " + fullName + "?");
    }
}
