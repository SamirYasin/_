package exception_handling.Multiple_catch_practice;

public class MultipleCatch_Practice {
    public static void main(String[] args) {
        String name = null;
        int age = 25;

        try {
            System.out.println(name.charAt(0));
            System.out.println(age / 0);
            System.out.println(name + "'s age is " + age);
        } catch(NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }
        String myName = "سمير";
        System.out.println(myName);
    }
}
