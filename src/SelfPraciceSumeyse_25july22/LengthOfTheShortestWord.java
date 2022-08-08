package SelfPraciceSumeyse_25july22;

import java.util.ArrayList;
import java.util.Arrays;

public class LengthOfTheShortestWord {

    public static void main(String[] args) {
        String givenString = "Alpha abc bravo charlie delta";
        System.out.println(giveMeTheLengthOfTheShortestWord(givenString));
    }

    public static int giveMeTheLengthOfTheShortestWord(String str) {
        ArrayList<String> array = new ArrayList<>(Arrays.asList(str.split(" ")));
        String shortest = array.get(0);
        for (String each : array) {
            if (each.length() < shortest.length()) shortest = each;
        }
        return shortest.length();
    }

}
