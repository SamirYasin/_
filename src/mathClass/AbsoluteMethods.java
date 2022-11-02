package mathClass;

import java.util.Scanner;

public class AbsoluteMethods {
    public static void main(String[] args) {
     /*   System.out.println("Difference between your numbers is = " + Math.abs(10 - 14));

      */
        //write a program that asks the user 2 ages adn the difference between the ages and prints them

        Scanner ageCalculator = new Scanner(System.in);
        System.out.println("Please enter an age ");
        int age1 = ageCalculator.nextInt();
        System.out.println("Please enter another age ");
        int age2 = ageCalculator.nextInt();
        System.out.println("The difference between the two ages is = " + Math.abs(age1 - age2));

    }
}
