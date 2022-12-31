package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class _03_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>(Arrays.asList("Chicago", "Miami", "New York", "San Francisco","LA"));
        System.out.println(cities);

        System.out.println(cities.headSet("Miami").tailSet("LA"));

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(10);

        System.out.println(numbers.first());

        System.out.println(numbers.pollFirst());

        System.out.println(numbers);

        numbers.clear();

        System.out.println(numbers.last());

    }
}
