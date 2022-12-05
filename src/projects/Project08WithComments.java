package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08WithComments {
    public static void main(String[] args) {
        int[] nums = {4,2,5,9,6,8,7,1};
        String s = "Hello WorldHe Wr";

        System.out.println(findMissingNumber(nums));
    }

    //Task 1
    public static int findClosestDistance(int[] nums) {
        int closestDif = Integer.MAX_VALUE;
        if (nums.length < 2) return -1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) < closestDif) closestDif = Math.abs(nums[i] - nums[j]);
            }
        }
        return closestDif;
    }
    /*
    We are passing in an int array (example: {3,4,6,8} and returning which two numbers would have the smallest difference,
    so first we get rid of the arrays that have only 1 or 0 elements(line 17) directions say to return -1;.
    now we need to loop through and subtract each number from every other number so for example: {3,4,6,8}, we need to subtract
    3 - 4 and set our int closestDif equal to the difference. but now we need to subtract 3 - 6. How do we do that?
    we can use a nested loop (two loops). first loop starts at i = 0 and second loops always one more, j = i + 1. so first iteration
    i = 0 and j = 1. we can use those to access the elements at those indexes. nums[i] - nums[j], for the first iteration
    this will be nums[0] - nums[1], then in the next iteration nums[0] - nums[2], in a nested loop the i will stay the same
    while the j will increase by one(j++, look at line 19 j will continue to increase by one until j > nums.length,
    once this happens i will increase by one and j will return to i + 1). like i said, for {3,4,6,8} well start with
    closestDif = 3 - 4 (equals 1, since were doing the absolute value), then we'll check 3 - 6 and see if it's less than
    closestDif, we set closestDif = to 3 - 6 (1 is less than 3 so this wont happen), so to when this runs, it will first
    be 3 - 4, then 3 - 6, then 3 - 8, (now j > nums.length) then 4 - 6 (i = 1, j = i + 1), then 4 - 8, and so on.
    we only reassign closestDiff when the difference of the two numbers is less than closestDiff.
    */

    //Task 2
    public static int findSingleNumber(int[] nums) {
        ArrayList nums1 = new ArrayList<>();
        for (int num : nums) {
            nums1.add(num);
        }
        for (int i = 0; i < nums1.size(); i++) {
            Object num = nums[i];
            nums1.remove(i);
            if (!nums1.contains(num)) {
                return nums[i];
            } else {
                nums1.add(i, num);
            }
        }
        return -1;
    }
    /*were passing in an int array and returning which element only occurs once (there is no duplicate), first i made an
    Arraylist and added each item from the original array to the arraylist. so now for example int[] = {1,1,2,2,3} is now
    an Arraylist, meaning we can add or remove items now. so now i looped through the arraylist we just made, and
    first i created a temporary object called "num" and set it equal to whichever element is at i so at first
    in {1,1,2,2,3} i will equal 1. (this gets reset for every iteration), we need to do this because the next step
    is to remove that element from the arraylist. after we remove that element we need to check and see if the
    arraylist still has that element or not. Before -> {1,1,2,2,3} After -> {1,2,2,3}. since there still exists a 1
    in the arraylist after removing num, this means that there is a duplicate and therefore not the number we want.
    we have to put that number back in the position we found it (line 52, line 53). so this loop will continue until
    it removes 3 so Before -> {1,1,2,2,3} After {1,1,2,2} we can see there is no duplicate of 3 in the arrayList
    so this is the number we want to return.
     */

    //Task 3
    public static char findFirstUniqueCharacter(String words) {
        ArrayList<Character> words1 = new ArrayList<>();
        for (int i = 0; i < words.length(); i++) {
            words1.add(words.charAt(i));
        }
        for (int i = 0; i < words1.size(); i++) {
            char letter = words1.get(i);
            words1.remove(i);
            if (!words1.contains(letter)) {
                return letter;
            } else {
                words1.add(i, letter);
            }
        }
        return ' ';
    }
    /* the logic is the exact same as in task 3
     */
    //Task 4
    public static int findMissingNumber(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] + 1 != nums[i + 1]) return nums[i] + 1;

        } return -1;
    }
    /*
    were told that the array were passing in has a sequence of numbers that increases by 1 but, these numbers are not
    in order for example {2,7,1,5,3,6} so we need to put them in order first. (line 92 is how we sort it)
    Before -> {2,1,5,3} After -> {1,2,3,5,6,7}. so now we can find our missing number by looping and checking
    if the i is equal to i + 1. so at first, in our sorted array were checking if (1) + 1 = (2). so this loop will
    continue until i = 3, because at this point i = 3 and (i + 1) = 5, so our condition which was if (3) + 1 = 5.
    since this is not true, we know that our missing number must be 4. so we just return 3 + 1;
     */
}
