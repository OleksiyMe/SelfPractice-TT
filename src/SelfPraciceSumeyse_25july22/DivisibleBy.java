package SelfPraciceSumeyse_25july22;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleBy {

    public static void main(String[] args) {
        ArrayList<Integer> testSequence = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8
        ));
        System.out.println(checkIt(testSequence, 3));
    }
    public static ArrayList<Integer> checkIt(ArrayList<Integer> testSequence, int divisor) {
        testSequence.removeIf(p -> p % divisor != 0);
        return testSequence;
    }
}
