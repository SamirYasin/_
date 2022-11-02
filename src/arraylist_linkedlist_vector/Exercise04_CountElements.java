package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.Vector;

public class Exercise04_CountElements {
    public static void main(String[] args) {
    Vector<Integer> numbers = new Vector<>(Arrays.asList(10,15,20,25,30));
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        System.out.println(numbers.stream().filter(x -> x % 2 == 0));
    }
}

