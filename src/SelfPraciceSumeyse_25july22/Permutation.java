package SelfPraciceSumeyse_25july22;

import java.util.*;

public class Permutation {
    static int counter = 1;
    static Map<Integer, ArrayList<Object>> allCombinationsMap = new TreeMap<>();

    public static void main(String[] args) {
        String str = "abcd";

        List<Object> list = new ArrayList<>(Arrays.asList(
                str.split("")
                ));
        permute(list, 0);
        allCombinationsMap.forEach((k, v) -> {
            System.out.println("Combination " + k + " is " + v.toString().replace(", ","").
                    replace("[","").replace("]",""));
        });
    }

    static void permute(List<Object> list, int k) {
        for (int i = k; i < list.size(); i++) {
            Collections.swap(list, i, k);
            permute(list, k + 1);
            Collections.swap(list, k, i);
        }
        if (k == list.size() - 1) {
            allCombinationsMap.put(counter++, new ArrayList<>(list));
        }
    }
}

