package SelfPracticeSumeyse_5aug22;

import java.util.*;

public class KeyboardBySumeyse {
    public static void main(String[] args) {
         String[] arr={"Hello", "TAlaska", "Dad", "Peace"};
       System.out.println("typed in one row: " + Arrays.toString(findWords(arr)));
    }
    public static String[] findWords(String[] words) {
        String R1 = "qwertyuiop";
        String R2 = "asdfghjkl";
        String R3 = "zxcvbnm";
        List<String> answer = new ArrayList<>();
        for (String s : words) {
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (R1.indexOf(c) != -1) {
                    set.add('1');
                } else if (R2.indexOf(c) != -1) {
                    set.add('2');
                } else if (R3.indexOf(c) != -1) {
                    set.add('3');
                }
            }
            if (set.size() == 1) {
                answer.add(s);
            }
        }
        String[] ans = new String[answer.size()];
        int i = 0;
        for (String s : answer) {
            ans[i++] = s;
        }
        return ans;
    }

}
