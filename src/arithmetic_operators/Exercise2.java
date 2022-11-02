package arithmetic_operators;

public class Exercise2 {
    public static void main(String[] args) {
        int num = 10;
        int start = 1;

        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);
        System.out.println(num + " * " + start + " = " + num * start++);

        int number = 1;
        for (int i = 1; i <= 1000; i++) {
            System.out.println(number + " * " + i + " = " + i * number++);

        }
    }
}
