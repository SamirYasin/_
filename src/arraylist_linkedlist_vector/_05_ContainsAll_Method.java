package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _05_ContainsAll_Method {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("Spain");
        countries.add("Portugal");
        countries.add("Sweden");
        if(countries.contains("Sweden") & countries.contains("Denmark")){
            System.out.println(true);
        }
        System.out.println(false);
    }
}
