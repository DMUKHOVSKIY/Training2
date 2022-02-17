import java.util.Random;

public class Exercise7 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] arr = new int[12];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 12; i++) {
            arr[i] = rand.nextInt(15);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < 12; i++) {
            if (max <= arr[i]) {
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println("\n\nMax element with index " + index + " = " + max);

    }
}
