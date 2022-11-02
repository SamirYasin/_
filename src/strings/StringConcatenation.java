package strings;

public class StringConcatenation {
    public static void main(String[] args) {
    String firstName = "Samir", lastName = "Yasin", fullName = firstName + lastName;
    System.out.println(fullName);

    String firstName2 = firstName.concat(lastName);
        System.out.println(firstName2);

    String lastName2 = firstName.concat(" ").concat(lastName);
        System.out.println(lastName2);
    }
}
