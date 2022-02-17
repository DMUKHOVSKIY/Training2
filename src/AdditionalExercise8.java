import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AdditionalExercise8 {

    static void Swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }


        //Пузырьком
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++)
                if (arr[j] > arr[j + 1])
                    Swap(arr, j, j + 1);
        }

        /*//Выбором
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min =j;
                }
            }
            Swap(arr,i,min);
        }*/

        /*//Вставкой
        for (int i = 1; i < size; i++) {
            int k = i;
            while (k > 0 && arr[k - 1] > arr[k]) {
                Swap(arr, k - 1, k);
                k--;
            }
        }*/

        System.out.println("\nSorted array = " + Arrays.toString(arr));
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] != arr[size - 1]) {
                System.out.println("\n" + arr[i]);
                break;
            }
        }
    }
}



