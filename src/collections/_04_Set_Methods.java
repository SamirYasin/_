package collections;

import java.util.HashSet;
import java.util.Set;

public class _04_Set_Methods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Foo");
        set.add("Bar");
        set.add("bar");
        set.add("foo");
        set.add("abc");
        set.add("xyz");

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("abc"));
    }
}
