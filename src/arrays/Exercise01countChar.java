package arrays;

public class Exercise01countChar {
    public static void main(String[] args) {
        String word = "Java";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a'){
                count += 1;
            }

        }
        System.out.println(count);
    }
}
