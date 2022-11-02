package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {
        /* Task 1
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,23,67,23,78));
        System.out.println(nums.get(3));
        System.out.println(nums.get(0));
        System.out.println(nums.get(2));
        System.out.println(nums);

         Task 2
        ArrayList<String> items = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));
        System.out.println(items.get(1));
        System.out.println(items.get(3));
        System.out.println(items.get(5));
        System.out.println(items);

        Task 3
ArrayList<Integer> num2 = new ArrayList<>();

    num2.add(23);
    num2.add(-34);
    num2.add(-56);
    num2.add(0);
    num2.add(89);
    num2.add(100);

    System.out.println(num2);
    Collections.sort(num2);
    System.out.println(num2);

    task 4
     ArrayList<String> cities = new ArrayList<>();

    cities.add("Istanbul");
    cities.add("Berlin");
    cities.add("Madrid");
    cities.add("Paris");

    System.out.println(cities);
    Collections.sort(cities);
    System.out.println(cities);

    task 5
    ArrayList<String> characters = new ArrayList<>();

    characters.add("Spider Man");
    characters.add("Iron Man");
    characters.add("Black Panther");
    characters.add("Deadpool");
    characters.add("Captain America");


    System.out.println(characters);
    System.out.println(characters.contains("Wolwerine"));
    task 6
     ArrayList<String> Avengers = new ArrayList<>();

    Avengers.add("Black Widow");
    Avengers.add("Captain America");
    Avengers.add("Hulk");
    Avengers.add("Iron Man");

    Collections.sort(Avengers);
    System.out.println(Avengers);

    for (int i = 0; i < Avengers.size(); i++) {
        if (colors.get(i).contains("Hulk") && colors.get(i).contains("Iron Man")){
        }else System.out.println("false");
    }System.out.println("true");

    task 7
      ArrayList<Character> chars = new ArrayList<>();

    chars.add('A');
    chars.add('x');
    chars.add('$');
    chars.add('%');
    chars.add('9');
    chars.add('*');
    chars.add('+');
    chars.add('F');
    chars.add('G');

    System.out.println(chars);

    for (int i = 0; i < chars.size(); i++) {
        System.out.println(chars.get(i));
    }
        Task 8

            ArrayList<String> items = new ArrayList<>();
            items.add("Desk");
            items.add("Laptop");
            items.add("Mouse");
            items.add("Monitor");
            items.add("Mouse-Pad");
            items.add("Adapter");

            System.out.println(items);
            Collections.sort(items);
            System.out.println(items);

            int countM = 0;
            int countNoAorE = 0;

            for (String item : items) {
                if (item.toLowerCase().charAt(0) == 'm') {
                    countM++;
                }
                if (!item.toLowerCase().contains("a") & !item.toLowerCase().contains("e")){
                    countNoAorE++;
                }
            }
            System.out.println(countM);
            System.out.println(countNoAorE);

         Task 9
           ArrayList<String> items = new ArrayList<>();

           items.add("Plate");
           items.add("spoon");
           items.add("fork");
           items.add("Knife");
           items.add("cup");
           items.add("Mixer");

        System.out.println(items);

        int countUpper = 0, countLower = 0, countP = 0, countPStartAndEnd = 0;

        for (String item: items) {
            if(Character.isUpperCase(item.charAt(0))){
                countUpper++;
            }
            if(Character.isLowerCase(item.charAt(0))){
                countLower++;
            }
            if(item.toLowerCase().contains("p")){
                countP++;
            }
            if(item.toLowerCase().startsWith("p") | item.toLowerCase().endsWith("p")){
                countPStartAndEnd++;
            }
        }
        System.out.println("Elements that start with uppercase = " + countUpper);
        System.out.println("Elements that start with lowercase = " + countLower);
        System.out.println("Elements having P or p = " + countP);
        System.out.println("Elements that start or end with P or p = " + countPStartAndEnd);

        Task 10
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,5,7,10,0,20,17,10,23,56,78));

        System.out.println(nums);
        System.out.println("Elements that can be divided by 10 = " + nums.stream().filter(x -> x % 10 == 0).count());
        System.out.println("Elements that are even and greater than = " + nums.stream().filter(x -> x > 15 & x % 2 == 0).count());
        System.out.println("Elements that are odd and less than 20 = " + nums.stream().filter(x -> x < 20 & x % 2 == 1).count());
        System.out.println("Elements that less than 15 or greater than 50 = " + nums.stream().filter(x -> x < 15 | x > 50).count());

         */


    }
}
