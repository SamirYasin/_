package loops.fori_loops;

import java.util.Scanner;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey user, enter a number");
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);

        }
    }
}
