package SelfPraciceSumeyse_25july22;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class OddTimesAppearance {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1};
        Map<Integer, Integer> map = new TreeMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : array) {
            if (map.containsKey(each)) map.put(each, map.get(each) + 1);
            else map.put(each, 1);
        }
        map.forEach((k, v) -> {
            if (v % 2 != 0) result.add(k);
        });

        System.out.println(result);

    }
}
