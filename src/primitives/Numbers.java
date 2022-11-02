package primitives;

public class Numbers {
    public static void main(String[] args) {
        /*
        6 primitives used to store numbers as data: byte, short, int, long

    bytes cannot hold more than -128 - 127
    short can only hold +-32,768
    int can only hold 2.14 billion
    long can hold 8 bytes -- but you must put L after the number
    you can use underscores for long numbers to make it readable 2_147_483_648L

    float can use 4 bytes; needs an f at the end; can provide precision up to 6 decimal places
    double can use 8 bytes; can go up to 15 decimal places

     */
        byte age = 45;
        System.out.println(age);

        int favNumber = 100;
        System.out.println(favNumber);

        System.out.println(age + favNumber);

        float balance1 = 23.23232323f;
        double balance2 = 23.23232323;

        double num3 = 1.123456789123456;
        double num4 = 2.345678901234567;

        System.out.println(num3 * num4);

        byte num1 = 127;
        byte num2 = 127;

        System.out.println(num1 + num2);
    }
}
