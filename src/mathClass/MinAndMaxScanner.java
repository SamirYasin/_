package mathClass;

import java.util.Scanner;

public class MinAndMaxScanner {
    public static void main(String[] args) {
        //get two numbers from user and find the max and min
        Scanner maxMinReader = new Scanner(System.in);
        System.out.println("Please input 3 numbers and press enter ");
        int firstNumber = maxMinReader.nextInt(), secondNumber = maxMinReader.nextInt(), thirdNumber = maxMinReader.nextInt();
        int max1 = Math.max(firstNumber, secondNumber);
        int min1 = Math.min(firstNumber, secondNumber);

        System.out.println("The max of the 3 numbers is " + Math.max(max1, thirdNumber));
        System.out.println("The min of the 3 numbers is " + Math.min(min1, thirdNumber));
    }
}
