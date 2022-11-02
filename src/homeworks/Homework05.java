package homeworks;

import java.util.Locale;
import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        /* Task 1

        String seven = "";
        for (int i = 1; i <= 100 ; i++){
            if(i % 7 == 0){
                seven += i + " - ";
            }

        }
        System.out.println(seven.substring(0, seven.length() - 3));

         Task 2
        String nums = "";
        for (int i = 1; i <= 50 ; i++) {
            if(i % 2 == 0 & i % 3 == 0){
                nums += i + " - ";
            }

        }
        System.out.println(nums.substring(0, nums.length() - 3));

        Task 3
        String nums = "";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) {
                nums += i + " - ";
            }
        }
        System.out.println(nums.substring(0, nums.length() - 3));

        Task 4
        for (int i = 0; i <= 7 ; i++) {
            System.out.println("The square of " + i + " is = " + (i * i));

        }

         Task 5
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;

        }
        System.out.println(sum);

         Task 6
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt(), multiplication = 1;

        for (int i = 1; i <= num ; i++) {
            multiplication *= i;


        }
        System.out.println(multiplication);

         Task 7
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first and lastname");

        String name = input.nextLine();
        String vowelLetters = "aeiou";

        int count = 0;

        for (int i = 0; i <= name.length() - 1 ; i++) {
            if(vowelLetters.contains(String.valueOf(name.charAt(i)))){
                count += 1;
            }

        } System.out.println("There are " + count + " vowels in your name");

         Task 8
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = input.nextInt();
        do{
            if(num1 >= 100){
                System.out.println("This number is already over 100");
                break;}
            System.out.println("Please enter another number");
            int num2 = input.nextInt();
            num1 += num2;
            if (num1 >= 100){
                System.out.println("the sum of the numbers is already over 100");
            }
        }while(num1 <= 100);

         task 9
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of sequences you would like in Fibonacci sequence");
        int fibNum = input.nextInt();
        int num1 = 0, num2 = 1;
        int counter = 0;
        String sequence = "";

        while (counter <= fibNum) {
            if(counter == fibNum){
                sequence += num1;
            } else {
                sequence += num1 + " - ";
            }
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;


            }
        System.out.println(sequence);


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name");

        String name = input.nextLine().toLowerCase();

        while(name.charAt(0) != 'j'){
            System.out.println("Please enter another name");
            name = input.nextLine().toLowerCase();
        }

         */


        }


    }
