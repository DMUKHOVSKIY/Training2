import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {

        int[] arr = new int[20];
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            arr[i] = rand.nextInt(20);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nNew array:");

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }


    }
}
