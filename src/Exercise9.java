import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int size = -1;
        int sum1 = 0;
        int sum2 = 0;

        while (size < 0 || size % 2 != 0) {
            size = scan.nextInt();
            if (size < 0 || size % 2 != 0)
                System.out.println("Enter correct number");
        }

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(15);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0, j = size - 1; i < size / 2; i++, j--) {
            sum1 += arr[i];
            sum2 += arr[j];
        }

        if (sum1 > sum2)
            System.out.println("First is bigger");
        else if (sum1 < sum2)
            System.out.println("Second is bigger");
        else
            System.out.println("They are the same");
    }
}
