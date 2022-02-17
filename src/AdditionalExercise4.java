import java.util.Random;
import java.util.Scanner;

public class AdditionalExercise4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();


        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] < min && arr[i] % 2 != 0) {
                min=arr[i];
            }
        }

        System.out.println("\n" + min);
    }
}
