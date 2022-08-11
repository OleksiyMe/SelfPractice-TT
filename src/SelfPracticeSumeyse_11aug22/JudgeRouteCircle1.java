package SelfPracticeSumeyse_11aug22;

import java.util.*;

public class JudgeRouteCircle1 {
    public static void main(String[] args) {

        String input = "LLUDRR";
        System.out.println("Is it makes a circle? " + isItBack(input));
    }

    private static boolean isItBack(String input) {
        Map<Character, Integer> map =
                new HashMap<>(Map.of('U',0,'D',0,'L',0,'R',0));

        for (char ch : input.toCharArray()) {
            map.put(ch, map.get(ch) + 1);
        }
        return (map.get('U') - map.get('D'))==0 && 0==(map.get('R') - map.get('L'));
    }
}
