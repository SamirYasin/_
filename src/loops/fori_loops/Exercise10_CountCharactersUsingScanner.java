package loops.fori_loops;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey user, enter a name");
        String name = input.nextLine().toLowerCase();
        int counter = 0;
        for (int i = 0; i <= name.length() - 1; i++) {
            if(name.charAt(i) == 'l'){
                counter += 1;

            }

        }
        System.out.println("The number of l's in the name is = " + counter);
    }
}
