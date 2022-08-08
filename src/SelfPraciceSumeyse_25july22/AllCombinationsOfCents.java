package SelfPraciceSumeyse_25july22;

import java.util.*;

public class AllCombinations2 {

    public static int counter = 1;
    public static Map<Integer, ArrayList<Integer>> allCombinationsMap = new TreeMap<>();

    static void permute(List<Integer> list, int k) {

        for (int i = k; i < list.size(); i++) {
            java.util.Collections.swap(list, i, k);
            permute(list, k + 1);
            java.util.Collections.swap(list, k, i);
        }
        if (k == list.size() - 1) {
            //Map<Integer, ArrayList<Integer>> mapOfCombinations=new TreeMap<>();
            allCombinationsMap.put(counter++, new ArrayList<>(list));
            // System.out.println(java.util.Arrays.toString(list.toArray()) + " : " + counter++);

        }
    }

    public static void change(int cents) {

        Set<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        
        for (ArrayList<Integer> eachCombination : allCombinationsMap.values()) {
          //  System.out.println(eachCombination);
            int tmpCents=cents;
          //  System.out.println(eachCombination);
            for (Integer eachCoin : eachCombination) {

               // if (tmpCents > 0) {
                   if (tmpCents/eachCoin!=0)
                    treeSet.add(eachCoin + "cent*" + tmpCents / eachCoin+" ");

                   //System.out.println(eachCoin + "  : " + tmpCents / eachCoin);
                    tmpCents = tmpCents % eachCoin;
              //  }
            }
           // System.out.println(treeSet);
            hashSet.add(treeSet.toString());
            treeSet.clear();

        }


       // System.out.println(treeSet);
       hashSet.forEach(p->{

           System.out.println(p);
       });
        System.out.println(hashSet.size());

    }


    public static void main(String[] args) {

        int cents = 11;
        permute(java.util.Arrays.asList(1, 5, 10, 25, 50), 0);
      //  System.out.println(allCombinationsMap);
        change(cents);


    }
}
