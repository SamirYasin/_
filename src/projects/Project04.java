package projects;

import java.util.Locale;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* Task 1
        System.out.println("Hey user, enter a word at least eight letters long");
        String str = input.nextLine();
        if(str.length() < 8){
            System.out.println("This string does not have eight characters");
        }else if(str.length() == 8){
            System.out.println(str.substring(4) + str.substring(0,4));
        } else{System.out.println(str.substring(str.length() - 4) + str.substring(4,str.length() - 4) + str.substring(0,4));}

        Task 2
        System.out.println("Hey user, please enter a sentence");
        String sentence = input.nextLine();
        if(!sentence.contains(" ")){
            System.out.println("This sentence as less than two words");
        } else{ System.out.println(sentence.substring(sentence.lastIndexOf(" ") + 1) + sentence.substring(sentence.indexOf(" "), sentence.lastIndexOf(" ") + 1) + sentence.substring(0, sentence.indexOf(" ")));}

        Task 3
        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println("Please choose the BAD sentence that you would like make a GOOD sentence, or TYPE your own bad sentence\n\n"
                + str1 + " ...TYPE: 1\n" + str2 + "...TYPE: 2\n" + str3 + "...TYPE: 3");
        String choice = input.nextLine(), sentence = "";

        switch (choice) {
            case "1":
                sentence += str1;
                break;
            case "2":
                sentence += str2;
                break;
            case "3":
                sentence += str3;
                break;
            default:
                sentence += choice;
                break;
        }

        if(sentence.contains("stupid") & sentence.contains("idiot")){
            System.out.println(sentence.replace("stupid", "nice").replace("idiot", "nice"));
        }else if(sentence.contains("idiot")){
            System.out.println(sentence.replace("idiot", "nice"));
        } else if(sentence.contains("stupid")) {
            System.out.println(sentence.replace("stupid", "nice"));
        } else System.out.println("This is already a good sentence");

         Task 4
        System.out.println("please enter your name");
        String name = input.nextLine();

        if(name.length() < 2){
            System.out.println("invalid input!!!");
        } else if (name.length() % 2 == 1){
            System.out.println(name.substring(name.length() / 2, name.length() / 2 + 1));
        } else {
            System.out.println(name.substring(name.length() / 2 - 1 , name.length() / 2 + 1));
        }

         Task 5
        System.out.println("Please enter a country");
        String country = input.nextLine();
        if(country.length() < 5){
            System.out.println("Invalid input!!!");
        } else System.out.println(country.substring(2, country.length() - 2));


        System.out.println("Please enter your address");
        String address = input.nextLine(), newAddress = "";


            }

        }

        System.out.println(address.toLowerCase(Locale.ROOT).replace("a", "*").replace("e", "#").replace("i", "+").replace("o", "@").replace("u", "$"));

/*

         Task 7
        int randomNum = (int) (Math.random() * 26), randomNum2 = (int) (Math.random() * 26);
        String nums = "";

        for (int i = Math.min(randomNum2,randomNum); i < Math.max(randomNum, randomNum2); i++) {
            nums += i + " - ";

        }
        if(randomNum2 != randomNum) {
            System.out.println(nums.substring(0, nums.length() - 3));
        } else{
            System.out.println(randomNum);
        }

        Task 8
        int count = 1;
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' '){
                count += 1;

            }

        }
        if(count == 1){
        System.out.println("This sentence does not have multiple words");
        } else{System.out.println("This sentence has " + count + " words");}

        Task 9
        System.out.println("Please enter a positive number");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i % 2 == 0 & i % 3 == 0){
                System.out.println("FooBar");
            } else if(i % 2 == 0){
                System.out.println("Foo");
            } else if(i % 3 == 0){
                System.out.println("Bar");
            } else{
                System.out.println(i);



        }





        }

        Task 10
        System.out.println("Please enter a word");
        String str = input.nextLine(), palindrome = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            palindrome += str.charAt(i);
        }
        if (str.length() <= 1) {
            System.out.println("This word does not have 1 or more characters");
        } else if (palindrome.equals(str)) {
            System.out.println("this word is a palindrome");
        } else {
            System.out.println("this word is not a palindrome");
        }

         Task 11
        System.out.println("please enter a sentence");
        String sentence = input.nextLine().toLowerCase();
        int aCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a'){
                aCount += 1;
            }

        }
        if (sentence.length() <= 0){
            System.out.println("This sentence does not have any characters");
    }   else{
            System.out.println("the number of a's in this sentence is " + aCount);}


        
        

        for (int i = 0; i < ; i++) {



         */
        String str = "sdfsfs";
        String newString = "";
        for (int i = 0; i < str.length(); i += 3) {
            newString += str.substring(i + 1, i + 3) + str.substring(i);
        }
        System.out.println(newString);
        }

            
        }
            


