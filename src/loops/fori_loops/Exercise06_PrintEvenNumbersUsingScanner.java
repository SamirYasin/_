package loops.fori_loops;

import java.util.Scanner;

public class Exercise06_PrintEvenNumbersUsingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hey user, enter a number");
        int start = input.nextInt();

        System.out.println("now enter a second number");
        int end = input.nextInt();

        int smallNum = Math.min(start, end), largeNum = Math.max(start, end);

        for(; smallNum < largeNum ; smallNum++) {
            if(smallNum % 2 == 0){
                System.out.println(smallNum);
            }
    }
}}
