import java.util.Arrays;
import java.util.Random;

public class Exercise8 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] arr1= new int[10];
        int[] arr2= new int[10];
        double[] arr3= new double[10];
        int count=0;

        for(int i=0;i<10;i++){
            arr1[i]=rand.nextInt(9);
            arr2[i]=rand.nextInt(9);

            double a = (double)arr1[i]/arr2[i];
            arr3[i]=a;

            if(a%1==0)
                count++;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println(count);


    }
}
