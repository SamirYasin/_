package oopPractice;

public class Test {
    public static void main(String[] args) {
        Sword sword1 = new Sword("Iron"); // default constructor
        System.out.println("Printing out the sword 1 " + sword1);

        Sword sword2 = new Sword(2.2, 15.0, "Long Sword", "Iron"); // -> Modified Constructor
        System.out.println("Printing out the sword 2" + sword2);
    }
}
