package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits);

        //ArrayList: preserve insertion order, allow duplicates(even empty), allow null
        //Performance
        //Memory
        //Initial Capacity
        //Load
        //Way data is stored

        LinkedList<String> fruitsLinked = new LinkedList<>();

        fruitsLinked.add("Apple");
        fruitsLinked.add("Apple");
        fruitsLinked.add("Orange");
        fruitsLinked.add("");
        fruitsLinked.add("");
        fruitsLinked.add(null);
        fruitsLinked.add(null);

        System.out.println(fruits);
    }
}
