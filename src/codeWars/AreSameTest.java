package codeWars;

import java.util.Arrays;

public class AreSameTest {
    public static void main(String[] args) {

        int[] a = new int[]{121, 144, 19, 161, -19, 144, 19, -11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(test(a, b));

    }
    public static boolean test(int[] a, int[] b) {

        if (a == null || b == null || a.length != b.length) {
            return false;
        }


        for (int i = 0; i < a.length; i++) {
            a[i] *= a[i];
        }
        Arrays.sort(a);
        Arrays.sort(b);


        return Arrays.equals(a, b);

    }
}
