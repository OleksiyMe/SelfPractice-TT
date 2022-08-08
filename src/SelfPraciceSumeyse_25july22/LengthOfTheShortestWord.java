package SelfPraciceSumeyse_25july22;

import java.util.ArrayList;
import java.util.Arrays;

public class LenghtOfTheShirtestWord {


    public static void main(String[] args) {

        String givenString="Alpha abc bravo charlie delta";


       ArrayList<String>array=new ArrayList<>(Arrays.asList(givenString.split(" ")));

       String shortest = array.get(0);
       for (String each : array) {
            if (each.length()<shortest.length()) shortest=each;
        }
        System.out.println(shortest.length());
    }
}
