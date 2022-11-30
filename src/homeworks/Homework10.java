package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Homework10 {
    public static void main(String[] args) {


    }
    /*
    // task 1
    public static int countWords(String s){
        int count = 0;
        String[] words = s.split(" ");
        for (String word : words) {
            if(word.length() >= 1) count++;
        }
        return count;
    }

    Task 2
    public static int countA(String s){
        int count = 0;
        if(s.length() == 0) return 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' | s.charAt(i) == 'A') count++;
        }
        return count;
    }


    //Task 3
    public static int countPos(ArrayList<Integer> nums){
        int count = 0;
        for (Integer num : nums) { if(num > 0) count++;
        } return count;
    }


    Task 4
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numList){
        HashSet<Integer> noDupe = new HashSet<>();
        noDupe.addAll(numList);
        ArrayList<Integer> noDupeList = new ArrayList<>();
        noDupeList.addAll(noDupe);
        return noDupeList;
    }

    Task 5
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> numList){
        HashSet<String> noDupe = new HashSet<>();
        noDupe.addAll(numList);
        ArrayList<String> noDupeList = new ArrayList<>();
        noDupeList.addAll(noDupe);
        return noDupeList;
    }

    Task 6
    public static String removeExtraSpaces(String s){
        String noSpace = "";
        if(s.length() <= 1) return s;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == ' ' & s.charAt(i + 1) == ' '){
                continue;
            } else noSpace += s.charAt(i);

        }
        return noSpace;
    }

    Task 7
    public static int[] sumOfArrays(int[] nums1, int[] nums2){
    int[] nums3 = new int[Math.max(nums1.length, nums2.length)];
        for (int i = 0; i < Math.min(nums1.length, nums2.length); i++) {
            nums3[i] = nums1[i] + nums2[i];
        }
        for (int i = Math.min(nums1.length, nums2.length); i < nums3.length; i++) {
            if(nums1.length > nums2.length){
                nums3[i] = nums1[i];
            } else {
                nums3[i] = nums2[i];
            }

        } return nums3;
    }

     Task 8
    public static int findClosestTo10(int[] nums){
        ArrayList<Integer> minusTen = new ArrayList<>();
        ArrayList<Integer> closeTen = new ArrayList<>();

        for (int num:
             nums) {
            minusTen.add(Math.abs(num - 10));
        }
        Collections.sort(minusTen);
        minusTen.removeAll(Collections.singleton(0));
        for (Integer num : nums) {
            if(Math.abs(num - 10) == minusTen.get(0)) closeTen.add(num);}
        Collections.sort(closeTen);
        return closeTen.get(0);
    }

     */



}

