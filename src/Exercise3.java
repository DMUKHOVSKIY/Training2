import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {

        int[] arr = new int[15];
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }


        int count = 0;
        for (int i = 0; i < 15; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }

        System.out.println("\n\nThe number of even numbers: " + count);
    }
}
