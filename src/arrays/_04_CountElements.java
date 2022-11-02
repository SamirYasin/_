package arrays;

public class _04_CountElements {
    public static void main(String[] args) {
        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};
        int positives = 0;
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i] > 0){
            positives += 1;}

        }
        System.out.println(positives);
    }
}
