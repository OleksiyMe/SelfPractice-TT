package SelfPraciceSumeyse_25july22;

import java.util.*;

public class Permutation1 {
    public static void main(String[] args) {
        String abba = "abba";
        permute(Arrays.asList(abba.split("")), 0);

    }
    static void permute(List<String> list, int k) {
        for (int i = k; i < list.size(); i++) {
            Collections.swap(list, i, k);
            permute(list, k + 1);
            Collections.swap(list, k, i);
        }
        if (k == list.size() - 1) {
            System.out.print (list.toString().replace(", ","").
                    replace("[","").replace("]","")+", ");
        }
    }
}