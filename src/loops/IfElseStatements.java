package loops;

import java.util.Random;

public class IfElseStatements {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 50;
        String num3 = String.valueOf(num1) + String.valueOf(num2);
        System.out.println(Integer.parseInt(num3) + 10);

        Random random = new Random();
        int rand = random.nextInt(3)+1;

        switch (rand){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;

        }


    }
}
