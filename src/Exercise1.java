public class Exercise1 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 2, j = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                arr[j] = i;
                j++;
            }
        }

        for (int a : arr)
            System.out.print(a + " ");

        System.out.println("New array\n");
        for (int a : arr)
            System.out.println(a);

    }
}
