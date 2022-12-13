package homeworks;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println(middleInt(2,7,8));
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arrFactorial(nums)));
        String s = "enfjwfnuiwueh1Wh21y37129837189h(&*@^#&*^@&#^*&@^*&   #*@#(& #@& #*& @#(  #gsygduygdfsgfs";
        System.out.println(Arrays.toString(categoriesCharacters(s)));
        System.out.println(noDigit(s));
        System.out.println(sumOfDigits(s));
        System.out.println(hasUpperCase(s));
    }
    //Task 1
    public static String noDigit(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) str += s.charAt(i);
        } return str;
    }
    //Task 2
    public static String noVowel(String s){
        return s.replaceAll("[aeiouAEIOU]", "");
    }
    //Task 3
    public static int sumOfDigits(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        } return sum;
    }
    //Task 4
    public static boolean hasUpperCase(String s){
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) return true;
        } return false;
    }
    //Task 5
    public static int middleInt(int a, int b, int c){
        int min = Math.min(Math.min(a,b),c);
        int max = Math.max(Math.max(a,b),c);
        return a + b + c - max - min;
    }
    //Task 6
    public static int[] no13(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 13) nums[i] = 0;
        }
        return nums;
    }
    //Task 7
    public static int[] arrFactorial(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = factorial(nums[i]);
        } return nums;
    }
    public static int factorial(int n){
        for (int i = n -1; i > 0; i--) {
            n *= i;
        } return n;
    }
    //Task 8
    public static String[] categoriesCharacters(String s){
        String[] strs = {"", "", ""};
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) strs[0] += s.charAt(i);
            else if(Character.isDigit(s.charAt(i))) strs[1] += s.charAt(i);
            else strs[2] += s.charAt(i);
        }
        return strs;
    }

}
