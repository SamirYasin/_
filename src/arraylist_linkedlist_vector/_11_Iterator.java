package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class _11_Iterator {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Pasta");
        food.add("Burger");
        food.add("Lamb Chops");
        food.add("Salad");
        food.add("Falafel");
        food.add("Sushi");

      Stream<String> notFive = food.stream().filter(x -> x.length() != 5);
        System.out.println(notFive.toList());

        System.out.println(food);

        Iterator<String> foodIterator = food.iterator();
        while(foodIterator.hasNext()){
            String f = foodIterator.next();

            if(f.length() == 5){
                foodIterator.remove();
            }
        }
        System.out.println(food);

    }
}
