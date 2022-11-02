package loops;

public class Exercise05_FindTheIndexOf {
/*
        public static int findFirstIndexOf(String s, char c){
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c){
                    return i;
                }
            } return -1;
        public static int findLastIndexOf(String s, char c){
                for (int i = s.length() - 1; i >= 0; i--) {
                    if (s.charAt(i) == c){
                        return i;
                    }

                }
            }
        public static String frontAndBack(){

            }

 */
public static void main(String[] args) {
    int count = 0;
    int count2 = 0;
    String s = "";
    String str = "sssssssssssssssssss";
    for (int i = 0; i < str.length(); i++) {
        for (int j = 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)){
                count += 1;
                if (count > count2){
                    count2 = count;
                    count = 0;
                    s += str.charAt(i);
                }

        }
    }
}System.out.println(s + " is the most common letter, count = " + count);
}}

