package SelfPraciceSumeyse_25july22;

import java.util.*;

public class AllCombinationsOfCents {
    public static int counter = 1;
    public static Map<Integer, ArrayList<Integer>> allCombinationsMap = new TreeMap<>();
    static void permute(List<Integer> list, int k) {
        for (int i = k; i < list.size(); i++) {
            java.util.Collections.swap(list, i, k);
            permute(list, k + 1);
            java.util.Collections.swap(list, k, i);
        }
        if (k == list.size() - 1) {
            allCombinationsMap.put(counter++, new ArrayList<>(list));
        }
    }

    public static void change(int cents) {
        Set<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (ArrayList<Integer> eachCombination : allCombinationsMap.values()) {
            int tmpCents = cents;
            for (Integer eachCoin : eachCombination) {
                if (tmpCents / eachCoin != 0)
                    treeSet.add(eachCoin + "cent*" + tmpCents / eachCoin + " ");
                tmpCents = tmpCents % eachCoin;
            }
            // System.out.println(treeSet);
            hashSet.add(treeSet.toString());
            treeSet.clear();
        }
        hashSet.forEach(p -> {
            System.out.println(p);
        });
        System.out.println(hashSet.size());

    }

    public static void main(String[] args) {

        int cents = 11;
        permute(java.util.Arrays.asList(1, 5, 10, 25, 50), 0);
        change(cents);
    }
}
