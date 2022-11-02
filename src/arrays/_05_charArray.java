package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {
        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));

        System.out.println("\n----------Task 2----------------\n");

        System.out.println(chars.length);

        System.out.println("\n----------------Task 3-------------------\n");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("\n-----------Task 4--------\n");
        for (char i : chars) {
            System.out.println(i);
        }
        System.out.println("n-----------Task 5------------\n");
        for (char i : chars) {
            if (Character.isLetter(i)) {
                System.out.println(i);
            }
        }
        System.out.println("\n----------Task 6------------\n");
        for(char i: chars){
            if (Character.isUpperCase(i)){
                System.out.println(i);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])){
                System.out.println(chars[i]);
            }

        }
        System.out.println("\n------------Task 7------------\n");
        int count = 0;
        int[] nums = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};
        for (int num : nums) {
            if(num % 2 == 0){
                count += 1;
            }
        }
        System.out.println(count);


    }
}