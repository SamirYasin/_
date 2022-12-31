package collections;

import java.util.List;
import java.util.TreeSet;

public class Practice02_FindClosestToN {
    public static int findClosest(List<Integer> nums, int n){
        TreeSet<Integer> set = new TreeSet<>(nums);
        if(set.isEmpty() || (set.size() == 1 && set.first() == n)) throw new RuntimeException();
        else if(set.size() == 1) return set.first();
        else{
            int lowerNumber = set.lower(n), higherNumber = set.higher(n);

            if(n - lowerNumber > higherNumber - n) return higherNumber;
            else return n;//didnt feel like finishing the code
        }
    }
}
