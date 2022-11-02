package arrays;

import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,3,-3,45,6,7777,};
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for(int number : nums){
            System.out.println(number);
        }
    }
}
