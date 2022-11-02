package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        String[] countries = new String[3];
        countries[1] = "Spain";
        System.out.println(countries[1]);
        Arrays.toString(countries);
        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries));
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]);
        }






    }
}
