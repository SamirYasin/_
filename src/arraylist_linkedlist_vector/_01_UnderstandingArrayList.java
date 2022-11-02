package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {
        String[] names1 = new String[3];
        ArrayList<String> names2 = new ArrayList<>(3); // capacity is 10 by default

        System.out.println("the size of the array is = " + names1.length);
        System.out.println("the size of the arraylist is = " + names2.size());

        System.out.println("The array is = " + Arrays.toString( names1));
        System.out.println("The array is = " + names2);

        names1[0] = "Alex";
        names2.add(0, "John"); //also return True
        names1[1] = "Ali";
        names1[2] = "John";

        names2.add(1, "Joe");
        names2.add(2, "Jane");

        System.out.println(Arrays.toString(names1));
        System.out.println(names2);

        String[] names = {"Abdallah", "Vlad", "Saeed", "Suzanne","Hazal", "Yildiz", "Samir"};
        names2.addAll(Arrays.asList(names));
        System.out.println(names2);

        names1[1] = "Mike";
        names2.set(1, "Olena");
        System.out.println(Arrays.toString(names1));
        System.out.println(names2);

        names2.remove(1);
        System.out.println(names2);
        names2.add("Jimmy");
        System.out.println(names2);

        ArrayList<Object> items = new ArrayList<>();
        items.add(0);
        items.add("Samir");
        items.add(true);

        System.out.println(items);
        System.out.println(items.get(1));

        }
}

