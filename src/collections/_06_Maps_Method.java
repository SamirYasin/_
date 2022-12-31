package collections;

import java.util.*;

public class _06_Maps_Method {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");
        System.out.println(capitals);

        System.out.println(capitals.get("Spain"));

        System.out.println(capitals.getOrDefault("Belgium", "Does not exist")); //gives a default value incase key does not exist

        System.out.println(capitals.containsKey("Germany"));
        System.out.println(capitals.containsKey("Portugal")); //checks if the map contains the key and returns true or false

        System.out.println(capitals.containsValue("Ankara"));
        System.out.println(capitals.containsValue("Berlin"));

        capitals.replace("Ukraine", "Kyiv");

        System.out.println(capitals.replace("Germany", "Berlin", "Munich"));

        capitals.remove("France");

        System.out.println(capitals);

        Set<String> set = capitals.keySet();
        Collection<String> collection = capitals.values();

        System.out.println(set);
        System.out.println(collection);

        String[] fruitArray = {"apple", "banana", "orange"};
        String[] colorArray = {"red", "yellow", "orange"};

        //HashMap<String, String> fruitMap = IntStream.range(0, fruitArray.length).boxed().collect(Collectors.toCollection())
        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        Set<String> favKeys = favorites.keySet();
        Collection<String> favValues = favorites.values();

        System.out.println(favKeys);
        System.out.println(favValues);

        for(String value: favorites.values()){
            System.out.println(value);
        }
        int i = 1;
        for(Map.Entry<String, String> entry : favorites.entrySet()){
            System.out.println(i + ". key = " + entry.getKey() + " and the value for it is = " + entry.getValue());
i++;

}
// Keys: Day, Color, City, Car, Pet
// Values: Friday, Black, Chicago, Lexus, Turtle

/*
Get keys and print them
[Car, Color, City, Day, Pet]
 */

    }
}
