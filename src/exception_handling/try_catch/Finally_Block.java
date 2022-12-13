package exception_handling.try_catch;

public class Finally_Block {
    public static void main(String[] args) {
        String greeting = "Hello";
/*
        try{
            greeting.charAt(10);
        } catch (Exception e){
            greeting.charAt(9);
        }
        finally{
            System.out.println("end of program");
        }


 */
        String str = "Hello";
        int index = 10;

        while (true) {
            try {
                System.out.println("The character at index " + index + " is " + str.charAt(index));
                break;  // Break out of the while loop if no exception is thrown
            } catch (IndexOutOfBoundsException e) {
                // This block will be executed if an IndexOutOfBoundsException is thrown
                index--;
                System.out.println("Index " + index + " is out of bounds. Trying index " + (index - 1) + " instead.");
            }
        }
    }
}
