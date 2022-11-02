package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveIfElementsWithIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Pen", "Pencil", "Book", "Notebook", "Macbook Pro"));
        Iterator<String> notBook = objects.iterator();


        while(notBook.hasNext()){

            if(notBook.next().toLowerCase().contains("book")){
                notBook.remove();
            }
        }
        System.out.println(objects);
    }
}
