package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Homework09 {
    public static void main(String[] args) {
        /*
        //Task 6
        String str = "Java is fun", temp, finalStr = "";
        String[] words = str.split(" ");

        for (String word: words) {
            temp = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                temp += word.charAt(i);
            }
            finalStr += temp + " ";
        }
        System.out.println(finalStr.substring(0, finalStr.length() - 1));


        //Task 1
        String dupe = "There is no duplicates";
        int nums[] = {-4, 0, -7, 9, 5, 10, 89, 45};
        loop1:
        {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        dupe = String.valueOf(nums[i]);
                        break loop1;
                    }
                }
            }
        }
        System.out.println(dupe);


        //Task 2
        String[] words = {"Z", "abc", "z", "123", "#"};
        String dupe = "There is no duplicates";
        loop1:
        {
            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])){
                        dupe = words[i];
                        break loop1;
                    }
                }
            }
        }
        System.out.println(dupe);


        //Task 3
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        int nums[] = {-4, 0, -7, 0, 5, 10, -7, 0};
        loop1:
        {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        numbers.add(nums[i]);
                    }
                }
            }
        }
        if(numbers.size() == 0) System.out.println("There is no duplicates");
        else{
            for (int num:
                 numbers) {
                System.out.println(num);

            }
        }


        //Task 4
        LinkedHashSet<String> strSet = new LinkedHashSet<>();
        String words[] = {"A", "foo", "12", "Foo", "bar", "a", "a" };
        loop1:
        {
            for (int i = 0; i < words.length; i++) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])){
                        strSet.add(words[i]);
                    }
                }
            }
        }
        if(strSet.size() == 0) System.out.println("There is no duplicates");
        else{
            for (String word:
                    strSet) {
                System.out.println(word);

            }
        }



        //Task 5
    String[] words = {"abc","foo","bar", "sfsdfsf", "sdsdf", "qwfuishuid", "12q343"};
    String[] words1 = new String[words.length];
        for (int i = words.length - 1; i >= 0; i--) {
            words1[words.length - 1 - i] = words[i];
        }
        System.out.println(Arrays.toString(words1));

         */



    }
}
