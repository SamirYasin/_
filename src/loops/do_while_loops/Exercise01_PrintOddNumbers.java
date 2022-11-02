package loops.do_while_loops;

public class Exercise01_PrintOddNumbers {
    public static void main(String[] args) {
        int i = 0;
        while(i <= 10){
            if(i % 2 == 1){
                System.out.println(i);
            } i++;
        }
    }
}
