package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class _02_StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");

        cities.set(cities.indexOf("Miami"), "Evanston");
        cities.remove("Berlin");
        System.out.println(cities.size());
        System.out.println(cities);

        String[] newCities = {"New York", "Rome", "Gent"};
        cities.addAll(List.of(newCities));
        System.out.println(cities);


        cities.removeAll(cities);
        




    }
}
