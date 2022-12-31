package collections;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice03_SubSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(3,2,7,10,15,20,7,5));
        System.out.println(set.tailSet(7,false));
        System.out.println(set.headSet(5,true));
        System.out.println(set.tailSet(5, true).headSet(15, true));
    }
}
