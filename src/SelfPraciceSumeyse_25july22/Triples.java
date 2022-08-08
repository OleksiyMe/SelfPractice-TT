package SelfPraciceSumeyse_25july22;

public class Triples {
    public static void main(String[] args) {
        int []givenArray = {1, 3, 3, 3};
        System.out.println(noTriplets(givenArray));
    }
    public static boolean noTriplets(int[] array) {

        for (int each : array) {
            int count = 0;
            for (int each1 : array) {
                if (each == each1) count++;else count=0;
                if (count == 3) return false;
            }
        }
        return true;
    }
}
