package collections;

import java.util.*;
import java.util.function.IntFunction;

public class Practice01_RemoveDuplicates {
    public static Integer[] remDupes(Integer[] nums){
        return new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

    }
}
