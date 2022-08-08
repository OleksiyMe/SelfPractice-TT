package hlamAndGagbage;
import java.util.Arrays;
public class ZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 0, 1, 0};
        int[] arrOutput = new int [arr.length];

        for (int i = 0, j = 0, count = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                j = arr[i];
                arrOutput[count] = j;
                count++;
            }
        }
        System.out.println(Arrays.toString(arrOutput));


    }
}
