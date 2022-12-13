package date_time;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class YearOfBirth {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            // Ask the user to enter their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Calculate the year of birth
            int yearOfBirth = LocalDate.now().getYear() - age;

            // Print the year of birth
            System.out.println("Your year of birth is " + yearOfBirth);
        } catch(Exception e){
            System.out.println("That is not a valid age!!!");
        }

    }
}
