package homeworks;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework16 {
    public static void main(String[] args) {
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Mango", 5);
        System.out.println(calculateTotalPrice2(map));
    }

    public static TreeMap parseData(String s) {
        TreeMap<String, String> map = new TreeMap<>();
        String[] array = s.split("\\{|}");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].isEmpty()) {
                map.put(array[i], array[i + 1]);
                i++;
            }
        }
        return map;
    }

    public static double calculateTotalPrice1(Map<String, Integer> map) {
        double Apple = 2.00, Orange = 3.29, Mango = 4.99, Pineapple = 5.25, Total = 0.0;
        if (map.containsKey("Apple")) Total += map.get("Apple") * Apple;
        if (map.containsKey("Orange")) Total += map.get("Orange") * Orange;
        if (map.containsKey("Mango")) Total += map.get("Mango") * Mango;
        if (map.containsKey("Pineapple")) Total += map.get("Pineapple") * Pineapple;
        return Total;
    }

    public static double calculateTotalPrice2(Map<String, Integer> map) {
        double Apple = 2.00, Orange = 3.29, Mango = 4.99, Total = 0.0;
        if (map.containsKey("Apple")) {
            if (map.get("Apple") % 2 == 0) Total += map.get("Apple") * Apple * .75;
            else Total += (map.get("Apple") - 1) * Apple * .75 + Apple;
        }
        if (map.containsKey("Orange")) Total += map.get("Orange") * Orange;
        if (map.containsKey("Mango")) {
            for (int i = 1; i <= map.get("Mango"); i++) {
                if (i % 4 != 0) Total += Mango;
            }
        }
        return Total;
    }
}