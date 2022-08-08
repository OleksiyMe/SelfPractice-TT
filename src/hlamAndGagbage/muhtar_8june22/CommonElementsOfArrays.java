package muhtar_june;

public class CommonElementsOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 4, 5}, arr2 = {1, 8, 5};
        for (int each1 : arr1) {
            for (int each2 : arr2) {
                if (each1 == each2) System.out.print(each1 + " ");
            }
        }
    }
}
