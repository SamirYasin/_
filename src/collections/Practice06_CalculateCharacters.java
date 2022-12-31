package collections;

import java.util.*;

public class Practice06_CalculateCharacters {
    public static void main(String[] args) {
        String str = "bananan";
        System.out.println(mostChar(str));
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toLowerCase().toCharArray()) {
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }

        System.out.println(map);
    }

    public static Set<Character> mostChar(String s){
        TreeMap<Character, Integer> map = new TreeMap<>();
        Set<Character> set = new TreeSet<>();
        for(Character c: s.toCharArray()){
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > max) max = entry.getValue();
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == max) set.add(entry.getKey());
        } return set;
    }
}
