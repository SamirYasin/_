package loops;

import java.util.Scanner;

public class Exercise01_SumOfNumsByUser {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many numbers you want to enter");
        int count = input.nextInt();

        int sum1 = 0;

        for (int i = 1; i <= count; i++){
            System.out.println("please enter number " + i);
            sum1 += input.nextInt();
        }
        System.out.println("the sum of you numbers is " + sum1);

         */
        Scanner input = new Scanner(System.in);

        int sum1 = 0;

        int start = 1;

        System.out.println("Please enter how many numbers you would like to enter");
        int count = input.nextInt();

        while(start <= count){
            System.out.println("Please enter number " + start);
            sum1 += input.nextInt();
            start++;
        }
        System.out.println(sum1);
    }
}
