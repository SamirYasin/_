package loops.fori_loops;

public class Exercise07_PrintCharactersInAString {
    public static void main(String[] args) {
        String s = "TechGlobal School";
        for (int i = 0; i <= s.length()-1; i++) {
            System.out.println(s.charAt(i));
        }
    }
}
