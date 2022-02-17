import java.util.Random;
import java.util.Scanner;

public class AdditionalExercise1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int compos = 1;

        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0)
                compos *= arr[i];
        }
        System.out.println("\n" + compos);

    }

}
