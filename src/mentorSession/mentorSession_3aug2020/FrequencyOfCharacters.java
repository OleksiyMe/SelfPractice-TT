package mentorSession.mentorSession_3aug2020;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

          String str = "aabbc b";
       //  String str = "";
       // String str = null;

        System.out.println(charfreq(str));
    }

    private static Map<String, Integer> charfreq(String str) {

        Map<String, Integer> result = null;

        if (str == null) return result;
        result = new LinkedHashMap<>();

        if (str.isEmpty()) {
            return result;
        }

        for (String eachCharacter : str.split("")) {
            if (result.containsKey(eachCharacter))
                result.put(eachCharacter, result.get(eachCharacter) + 1);
            else result.put(eachCharacter, 1);
        }
        return result;
    }
}
