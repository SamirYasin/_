package arrays;

public class Exercize02_countWords {
    public static void main(String[] args) {
        String s = "i love java";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                count += 1;
            }

        }
        System.out.println(count + 1);
    }
}
