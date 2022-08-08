package SelfPraciceSumeyse_25july22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExesAndOhs {
    public static void main(String[] args) {
        String str = "ooXxm";
        //  String str = "zpzpzpp";
        System.out.println(XO(str));
    }
    public static boolean XO(String str) {
        Map<Character, Integer> map = new HashMap<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            Character currentChar = str.charAt(i);
            if (currentChar != 'o' && currentChar != 'x') continue;
            if (map.containsKey(currentChar)) map.replace(currentChar, map.get(currentChar)+1);
            else map.put(currentChar, 1);
        }
        System.err.println(map);
        return (map.get('o') == map.get('x')) ? true : false;
    }

}
