package collections;

import java.util.*;

public class Practice07_ProductPrices {
    public static void main(String[] args) {
        TreeMap<String, Integer> products = new TreeMap<>();
        products.put("iPhone", 1000);
        products.put("Macbook Pro", 1300);
        products.put("iMac", 1500);
        products.put("Airpods", 200);
        products.put("iPad", 700);

        TreeSet<Integer> prices = new TreeSet<>(products.values());
    }
    }
