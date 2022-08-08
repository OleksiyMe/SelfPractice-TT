package hlamAndGagbage.muhtar_8june22;

import java.util.Arrays;

public class CountersEvenOddOfIntArray {
    public static void main(String[] args) {
        int array[] = {1, 1, 1, 1, 2, 2, 2, 2, 6};
        int oddCounter = 0, evenCounter = 0;

        for (int each : array) {
            if (each % 2 != 0) {
                oddCounter++;
                continue;
            }
            evenCounter++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("oddCounter = " + oddCounter);
        System.out.println("evenCounter = " + evenCounter);
    }
}
