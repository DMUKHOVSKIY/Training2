import java.util.Arrays;
import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int mean1 = 0;
        int mean2 = 0;

        for (int i = 0; i < 5; i++) {
            arr1[i] = rand.nextInt(15);
            arr2[i] = rand.nextInt(15);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < 5; i++) {
            mean1 += arr1[i];
            mean2 += arr2[i];
        }

        if (mean1 > mean2)
            System.out.println("First is bigger");
        else if (mean2 > mean1)
            System.out.println("Second is bigger");
        else
            System.out.println("The are the same");
    }
}
