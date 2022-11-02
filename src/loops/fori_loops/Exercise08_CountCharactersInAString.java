package loops.fori_loops;

public class Exercise08_CountCharactersInAString {
    public static void main(String[] args) {
        String str = "Tech Global";
        int counter = 0;
        for(int i = 0; i <= str.length() -1; i++){
            if(str.charAt(i) == 'o'){
                counter += 1;
            }

        } System.out.println(counter);
    }
}
