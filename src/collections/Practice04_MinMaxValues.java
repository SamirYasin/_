package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice04_MinMaxValues {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(10,100,123,507,25));
    Integer[] num = {1,2,32,4,5,6,7,12121};
        System.out.println(max(num));
        System.out.println(min(num));
        System.out.println(secondMax(num));
    }

    public static int max(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollLast();
    }

    public static Integer min(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollFirst();
    }

    public static Integer secondMax(Integer[] arr){
        TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(arr));
        nums.pollLast();
        return nums.pollLast();
    }
}
