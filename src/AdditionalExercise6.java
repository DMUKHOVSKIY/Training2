import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AdditionalExercise6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean b = true;

        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }


        for (int i = 0; i < size; i++) {
            if (b == false)
                break;
            for (int j = 0; j < size; j++) {
                if (j == i)
                    continue;
                if (arr[i] == arr[j]) {
                    b = false;
                    break;
                }
            }
        }
        if (b)
            System.out.println("\nThere is no equals");
        else
            System.out.println("\nThere is some equals numbers");

    }
}
