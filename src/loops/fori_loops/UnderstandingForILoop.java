package loops.fori_loops;

public class UnderstandingForILoop {
    public static void main(String[] args) {
        int num = 0;
        for (; num <= 4; num++){
            System.out.println("Hello World");}


        for (int i = 1; i != 101; i++){
            if(i < 50) {
                System.out.println(i + " is less than 50");
            }else if(i == 50) {
                System.out.println(i + " is 50");
            }else{
                        System.out.println(i + " is more than 50");

            }
        }
}}