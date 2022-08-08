package mentorSession_3aug2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingVowel {

    public static void main(String[] args) {
        String str = "google";
        System.out.println(firstNonRepVowel(str));
    }
    private static Integer firstNonRepVowel(String str) {

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : str.split("")) {

            if (!"aeiou".contains(each)) continue;

            map.put(each, map.getOrDefault(each, 0) + 1);

            if (map.get(each) > 1) map.remove(each);
        }
        if (map.isEmpty()) return -1;
        //  System.out.println(map);
        return str.indexOf(map.toString().substring(1, 2));
    }
}
