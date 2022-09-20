package mentorSession.mentorSession14sept22;

import java.util.HashMap;
import java.util.Map;

public class TellMeFrequency {
    public static void main(String[] args) {
        Integer[] arr = {3, 3, 11, 5, 5, 5,5,5,5, 6, 6, 6, 6, 6,6,6,6,6,6,6,6,6,6,6,5,6,3,2,6};
        System.out.println(tellMeSomething(arr));
    }
    private static String tellMeSomething(Integer[] arr) {
        String result = "";
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer each : arr) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> each : map.entrySet()) {
            if (each.getValue() ==1) result+= ""+each.getKey()+" is one time \n";
            if (each.getValue() ==2) result+= ""+each.getKey()+" is two times \n";
            if (each.getValue() ==3) result+= ""+each.getKey()+" is three times \n";
            if (each.getValue() ==4) result+= ""+each.getKey()+" is four times \n";
            if (each.getValue() ==5) result+= ""+each.getKey()+" is five times \n";
            if (each.getValue() ==6) result+= ""+each.getKey()+" is six times \n";
            if (each.getValue() ==7) result+= ""+each.getKey()+" is seven times \n";
            if (each.getValue() ==8) result+= ""+each.getKey()+" is eight times \n";
            if (each.getValue() ==9) result+= ""+each.getKey()+" is nine times \n";
            if (each.getValue() ==10) result+= ""+each.getKey()+" is ten times \n";
            if (each.getValue() >10) result+= ""+each.getKey()+" is more than ten times \n";
        }
        return result;
    }
}