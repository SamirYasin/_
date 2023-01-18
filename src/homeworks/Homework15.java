package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import static java.util.Arrays.*;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println(fibonacciSeries2(8));
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(findUniques(test1, test2)));

        System.out.println(isPowerOf3(9));
    }

    //Task 1
    public static int[] fibonacciSeries1(int n) {
        int[] fibArray = new int[n];

        int num1 = 0, num2 = 1, num3;

        for (int i = 0; i < n; i++) {
            fibArray[i] = num1;
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return fibArray;
    }

    public static int fibonacciSeries2(int n) {
        int[] fibArray = new int[n];

        int num1 = 0, num2 = 1, num3;

        for (int i = 0; i < n; i++) {
            fibArray[i] = num1;
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return fibArray[n - 1];
    }

    public static int[] findUniques(int[] a, int[] b) {
        ArrayList<Integer> matchingElements = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    matchingElements.add(a[i]);
                }
            }
        }
        TreeSet<Integer> uniques = new TreeSet<>();
        for (int num : a) uniques.add(num);
        for (int num : b) uniques.add(num);

        uniques.removeAll(matchingElements);

        int[] array = new int[uniques.size()];
        int i = 0;
        for (Integer n : uniques) {
            array[i++] = n;
        }
        return array;
    }

    public static boolean isPowerOf3(int num){
        if(num/3 % 3 == 0) return true;
        return false;
    }

    public static int firstDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1;
    }

}