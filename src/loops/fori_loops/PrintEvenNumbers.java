package loops.fori_loops;

public class PrintEvenNumbers {
    public static void main(String[] args) {
      /*  for(int i = 0; i != 12; i += 2){
            System.out.println(i);
        }

       */
        for (int i = 1; i < 10; i++) {
            if(i == 2 | i == 7){
                continue;
            }
            System.out.println(i);

        }
    }
}
