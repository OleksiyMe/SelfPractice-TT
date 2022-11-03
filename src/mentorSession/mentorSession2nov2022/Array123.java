package mentorSession.mentorSession2nov2022;

import java.util.Arrays;

public class Array123 {


    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4};


        System.out.println(array.length);
        System.out.println(array[2]);
        System.out.println(Arrays.toString(array));

        int[] array1 = {1, 2, 5, 4};
        System.out.println(array == array1);
        System.out.println(array.equals(array1));
        System.out.println(Arrays.compare(array, array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(array == array1);

        System.out.println(Arrays.stream(array).count());

        int max = array1[0];
        for (int each : array1) {
            if (each > max) max = each;
        }
        System.out.println("Max is " + max);

//============================MULTIDIMENSIONAL===============================================

        int[][] twoDimArray;
        twoDimArray = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};

        //   1 2 3 4 5
        //   1 2 3 4 5

        System.out.println("DeepToString: " + Arrays.deepToString(twoDimArray));

        String[] arrayS = new String[]{"a", "b"};
        String[] arrayS1 = {"a", "b"};


    }
}
