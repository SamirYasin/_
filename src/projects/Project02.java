package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {
        //Task 1
       /* Scanner userInput = new Scanner(System.in);
        System.out.println("Hey user, please enter three numbers and press enter after each number");
        int firstNumber = userInput.nextInt(), secondNumber = userInput.nextInt(), thirdNumber = userInput.nextInt();
        System.out.println("The product of the numbers entered is = " + firstNumber * secondNumber * thirdNumber);

        //Task 2
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Hi user, what is your first name?");
        String firstName = userInput2.nextLine();
        System.out.println("and what is your last name?");
        String lastName = userInput2.nextLine();
        System.out.println("and lastly, what year were you born?");
        int yearOfBirth = userInput2.nextInt(), currentYear = 2022;
        System.out.println(firstName + " " + lastName + "'s " + "age is = " + (currentYear - yearOfBirth));


        //Task 3
        Scanner userInput3 = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = userInput3.nextLine();
        System.out.println("Please enter your weight in kg");
        double kgWeight = userInput3.nextInt();
        System.out.println(fullName + "'s weight in lbs is = " + (kgWeight * 2.205) + " lbs");

        */
        //Task 4
        Scanner userInput4 = new Scanner(System.in);
        System.out.println("Student 1, what is your full name?");
        String student1Name = userInput4.nextLine();

        System.out.println("Student 1, how old are you?");
        int student1Age = userInput4.nextInt();
        userInput4.nextLine();

        System.out.println("Student 2, what is your full name?");
        String student2Name = userInput4.nextLine();

        System.out.println("Student 2, how old are you?");
        int student2Age = userInput4.nextInt();
        userInput4.nextLine();

        System.out.println("Student 3, what is your full name?");
        String student3Name = userInput4.nextLine();

        System.out.println("Student 3, how old are you?");
        int student3Age = userInput4.nextInt();

        System.out.println(student1Name + "'s age is " + student1Age);
        System.out.println(student2Name + "'s age is " + student2Age);
        System.out.println(student3Name + "'s age is " + student3Age);
        System.out.println("The average age is " + ((student1Age + student2Age + student3Age) / 3));
        System.out.println("The eldest age is " + Math.max(Math.max(student1Age, student2Age), student3Age));
        System.out.println("The youngest age is " + Math.min(Math.min(student1Age, student2Age), student3Age));



    }
}
