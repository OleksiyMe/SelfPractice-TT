package hlamAndGagbage.muhtar_8june22;

public class UniqueElementsOfArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 4, 4};
        for (int each : array) {
            int count = 0;
                for (int each2 : array) {
                    if (each == each2) count++;
                    }
            if (count == 1) System.out.print(each + " ");
        }
    }
}
