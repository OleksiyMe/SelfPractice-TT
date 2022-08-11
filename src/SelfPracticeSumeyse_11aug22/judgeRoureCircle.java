package SelfPracticeSumeyse_11aug22;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class judgeRoureCircle {
    public static void main(String[] args) {

        String input="LLUDR";
        System.out.println("Is it makes a circle? "+isItBack(input));
    }
    private static boolean isItBack(String input) {
        Integer [] zeroPosition={0,0};
        Integer [] currentPosition={0,0};
        for (char ch : input.toCharArray()) {
            if(ch=='R')currentPosition[0]=currentPosition[0]+1;
            if(ch=='L')currentPosition[0]=currentPosition[0]-1;
            if(ch=='U')currentPosition[1]=currentPosition[1]+1;
            if(ch=='D')currentPosition[1]=currentPosition[1]-1;
        }
       /* System.out.println("zeroPosition = " + Arrays.toString(zeroPosition));
        System.out.println("currentPosition = " + Arrays.toString(currentPosition));*/
       return Arrays.equals(currentPosition,zeroPosition);
     }
}
