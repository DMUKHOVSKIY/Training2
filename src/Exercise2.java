import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                count++;
        }

        int[] arr = new int[count];
        for (int i = 1, j = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Reverse order:\n");

        for (int i = count - 1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
