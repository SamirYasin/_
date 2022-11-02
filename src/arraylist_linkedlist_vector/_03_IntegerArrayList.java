package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int[] numsArray = {10, 15, 20, 10, 20, 30};

        for (int i = 0; i < numsArray.length ; i++) {
            nums.add(numsArray[i]);
        }
        System.out.println(nums);


    }
}
