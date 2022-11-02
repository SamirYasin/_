package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {
        String wordPart1 = "le", wordPart2 = "ar", wordPart3 = "ning", word = wordPart1 + wordPart2 + wordPart3;
        System.out.println(word);

        String sentencePart1 = "I can ";
        String sentencePart2 = "learn Java";
        String sentenceFull = sentencePart1.concat(sentencePart2);
        System.out.println(sentenceFull);

    }
}
