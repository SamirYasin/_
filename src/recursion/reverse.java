package recursion;

public class reverse {
    public static String reverse(String s) {
        // base case: if the length of the string is 0 or 1, return the string
        if (s.length() <= 1) {
            return s;
        }
        // recursive case: return the reverse of the substring starting from the second character and concatenated with the first character
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }
}