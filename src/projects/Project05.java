package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Project05 {
    public static void main(String[] args) {
    }
    //Task 1
    public static void findGreatestAndSmallestWithSort(int[] arrayName) {
        Arrays.sort(arrayName);
        System.out.println("Smallest = " + arrayName[0]);
        System.out.println("Greatest = " + arrayName[arrayName.length - 1]);
    }
    //Task 2
    public static void findGreatestAndSmallest(int[] arrayName) {
        ArrayList<Integer> greatest = new ArrayList<>(arrayName.length);
        ArrayList<Integer> smallest = new ArrayList<>(arrayName.length);
        for (int i = 0; i < arrayName.length; i++) {
            greatest.add(i, arrayName[i]);
            smallest.add(i, arrayName[i]);
        }
        for (int i = 0; i < arrayName.length - 1; i++) {
            if (greatest.get(0) > greatest.get(1)) {
                greatest.remove(1);
            } else greatest.remove(0);

            if (smallest.get(0) < smallest.get(1)) {
                smallest.remove(1);
            } else smallest.remove(0);
        }
        System.out.println("Smallest = " + smallest.get(0));
        System.out.println("Greatest = " + greatest.get(0));
    }
    //Task 3
    public static void findSecondGreatestAndSmallestWithSort(int[] arrayName){
        Arrays.sort(arrayName);
        System.out.println("Second Greatest = " + arrayName[arrayName.length - 2]);
        System.out.println("Second Smallest = " + arrayName[1]);
    }
    //Task 4
    public static void findSecondGreatestAndSmallest(int[] arrayName){
        ArrayList<Integer> greatest = new ArrayList<>(arrayName.length);
        ArrayList<Integer> greatest2 = new ArrayList<>(arrayName.length);
        ArrayList<Integer> smallest2 = new ArrayList<>(arrayName.length);
        ArrayList<Integer> smallest = new ArrayList<>(arrayName.length);

        for (int i = 0; i < arrayName.length; i++) {
            greatest.add(i, arrayName[i]);
            greatest2.add(i, arrayName[i]);
            smallest.add(i, arrayName[i]);
            smallest2.add(i, arrayName[i]);
        }

        for (int i = 0; i < arrayName.length - 1; i++) {
            if (greatest.get(0) > greatest.get(1)) {
                greatest.remove(1);
            } else greatest.remove(0);

            if (smallest.get(0) < smallest.get(1)) {
                smallest.remove(1);
            } else smallest.remove(0);
        }

        greatest2.remove(Integer.valueOf(greatest.get(0)));
        smallest2.remove(Integer.valueOf(smallest.get(0)));

        for (int i = 0; i < arrayName.length - 2; i++) {
            if (greatest2.get(0) > greatest2.get(1)) {
                greatest2.remove(1);
            } else greatest2.remove(0);

            if (smallest2.get(0) < smallest2.get(1)) {
                smallest2.remove(1);
            } else smallest2.remove(0);
        }

        System.out.println("Second Smallest = " + smallest2.get(0));
        System.out.println("Second Greatest = " + greatest2.get(0));
    }
    //Task 5
    public static void findDuplicatedElementsInAnArray(String[] arrayName){
        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 0; i < arrayName.length; i++) {
            for (int j = 1; j < arrayName.length; j++) {
                if(arrayName[i] == arrayName[j] & i != j & !duplicates.contains(arrayName[i])){
                    duplicates.add(String.valueOf(arrayName[i]));
                }
            }
        }
        for (String duplicate: duplicates
        ) {
            System.out.println(duplicate);
        }

    }
    //Task 6
    public static void findMostRepeatedElementInAnArray(String[] arrayName){
        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 0; i < arrayName.length; i++) {
            int count = 0;
            for (int j = 1; j < arrayName.length; j++) {
                if(arrayName[i] == arrayName[j] & i != j){
                    count++;
                } duplicates.add("" + count + arrayName[i]);
            }
        }
        Collections.sort(duplicates);
        System.out.println(duplicates.get(duplicates.size() - 1).substring(1));
    }

}


