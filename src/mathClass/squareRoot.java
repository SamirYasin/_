package mathClass;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
      /*  int number = 81, number2 = 25, number3 = 64;
        System.out.println("Root of number is " + Math.sqrt(number));
        System.out.println("Root of number is " + Math.sqrt(number2));
        System.out.println("Root of number is " + Math.sqrt(number3));
        System.out.println("Root of number is " + Math.sqrt(3.14));

       */

        Scanner inputTaker = new Scanner(System.in);
        System.out.println("Hey user, input a number and press enter");
        double userNumber = inputTaker.nextDouble();
        System.out.println("Your numbers root is = " + Math.sqrt(userNumber));

    }
}
