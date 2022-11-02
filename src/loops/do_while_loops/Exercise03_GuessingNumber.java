package loops.do_while_loops;

import java.util.Random;

public class Exercise03_GuessingNumber{
    public static void main(String[] args) {
        int number = 7;

        int random = (int) (Math.random() * 10 + 1);

        int attempt = 1;

        while(random != number){
            System.out.println("the random number is  " + random);
            random = (int) (Math.random() * 10 + 1);
            attempt++;
        }
        System.out.println("It took " + attempt + " times to generate 7");
    }
}
