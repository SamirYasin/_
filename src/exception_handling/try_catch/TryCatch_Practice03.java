package exception_handling.try_catch;

import java.util.Arrays;

public class TryCatch_Practice03 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 5};

            System.out.println(numbers[5] * 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("there is no 6th index in this array");
        }
    }
}
