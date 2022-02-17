import java.util.Random;
import java.util.Scanner;

public class AdditionalExercise2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int sum = 0;
        double count = 0;

        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                sum += arr[i];
                count++;
            }
        }

        System.out.println("\n" + (sum / count));


    }
}
