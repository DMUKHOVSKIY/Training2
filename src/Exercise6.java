import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }

        boolean b = true;
        for (int i = 0; i < 3; i++) {
            if (arr[i + 1] < arr[i]) {
                b = false;
                break;
            }
        }

        if (b)
            System.out.println("\nYes, increasing sequence");
        else
            System.out.println("\nNo");
    }
}
