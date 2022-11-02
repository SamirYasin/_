package variables;
import java.sql.SQLOutput;
import java.util.Scanner;
public class UnderstandingVariables {
    public static void main(String[] args) {

        //variable declaration and assignment

        Scanner myObj = new Scanner(System.in);
        System.out.println("choose baby gender ");

        String gender = myObj.nextLine();
        String babyName = "";
        if(gender == "male"){
            babyName = "Samir";}
        if(gender == "female"){
            babyName = "Samira";}
        System.out.println("your baby's name is: " + babyName);
        }

            /*boolean isFemale = false;
        if(isFemale){
            babyName = "Emma";}
        else{
            babyName = "Sam";
        }
        System.out.println(babyName);

         */
    }
