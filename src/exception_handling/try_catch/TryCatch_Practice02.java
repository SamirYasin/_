package exception_handling.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch_Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;

        // Read x and y from the user
        System.out.print("Enter the first number: ");
        x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        y = scanner.nextInt();

        while (true) {
            try {
                int result = x / y;  // This line will throw an ArithmeticException if y is 0
                System.out.println("The result is " + result);
                break;  // Break out of the while loop if no exception is thrown
            } catch (ArithmeticException e) {
                // This block will be executed if an ArithmeticException is thrown
                System.out.println("Division by zero is not allowed!");
                System.out.print("Please enter a different second number: ");
                y = scanner.nextInt();
            }
        }
    }
}

