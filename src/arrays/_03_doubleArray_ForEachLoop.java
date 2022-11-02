package arrays;

import java.util.Arrays;

public class _03_doubleArray_ForEachLoop {
    public static void main(String[] args) {
        /*
        double[] doubles = {5.5, 6, 10.3, 25};
        System.out.println(Arrays.toString(doubles));

        System.out.println("the size of the array is " + doubles.length);

         */
        int num = 20000;
        int i = 0;
        while (num <= 1000000){
            num += num * .1188;
            System.out.println("Year " + i + ": money = " + num );
            i++;
        }
    }
}
