import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = 0;
        int count = 0;
        int lastInd = 0;

        while (n <= 3) {
            n = scan.nextInt();
            if (n <= 3)
                System.out.println("Enter correct number");
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                lastInd = i;
            }
        }


        if (count == 0)
            System.out.println("\nThere aren't even numbers");
        else {
            int[] newArr = new int[count];

            for (int i = 0, j = 0; i <= lastInd; i++) {
                if (arr[i] % 2 == 0) {
                    newArr[j] = arr[i];
                    j++;
                }
            }

            System.out.println(Arrays.toString(newArr));
        }

    }
}
