import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AdditionalExercise10 {
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

        int max = arr[0];
        int index = 0;
        for (int i = 0; i < size; i += 2) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        int temp = arr[0];
        arr[0] = arr[index];
        arr[index] = temp;

        System.out.println("\n" + Arrays.toString(arr));
    }
}
