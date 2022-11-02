package loops;

import java.util.Scanner;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter a name");
        String s = name.nextLine(), backwards = "";

        for (int i = s.length() -1; i >= 0 ; i--) {
            backwards += s.charAt(i);
        }
        System.out.println(backwards);
    }
}
