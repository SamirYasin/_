package homeworks;
import java.util.Arrays;
import java.util.TreeSet;


public class Homework14 {
    public static void main(String[] args) {
        fizzBuzz1(100);
        System.out.println(fizzBuzz2(100));

        System.out.println(findSumNumbers("123abc4"));

        System.out.println(findBiggestNumber("hjghj1qq525"));

        System.out.println(countSequenceOfCharacters("aaabbbbcccddddd"));
    }

    public static void fizzBuzz1(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else System.out.println(i);
        }
    }

    public static String fizzBuzz2(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else return String.valueOf(num);
    }


    public static int findSumNumbers(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isDigit(sb.charAt(i))) sb.setCharAt(i, '-');
        }
        String[] stringArray = sb.toString().split(String.valueOf('-'));

        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].isEmpty()) {
                intArray[i] = 0;
            } else intArray[i] = Integer.parseInt(stringArray[i]);
        }
        int sum = 0;

        for (int i : intArray) {
            sum += i;
        }
        return sum;
    }

    public static int findBiggestNumber(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (!Character.isDigit(sb.charAt(i))) sb.setCharAt(i, '-');
        }
        String[] stringArray = sb.toString().split(String.valueOf('-'));

        TreeSet<Integer> set = new TreeSet<>();

        for(String s: stringArray) {
            if (!s.equals("")) set.add(Integer.valueOf(s));
        } return set.last();

    }
    public static String countSequenceOfCharacters(String str){
        if (str.isEmpty()) return str;
        StringBuilder seq = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder temp = new StringBuilder("" + str.charAt(i));
            int count = 1;
            int j = i + 1;
            while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                temp.append(str.charAt(j));
                j++;
                count++;
            }
            seq.append(Integer.toString(count)).append(temp.charAt(0));
            i += count - 1;
        }
        return String.valueOf(seq);
    }
}
