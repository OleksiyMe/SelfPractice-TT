package SelfPraciceSumeyse_25july22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class RemovePalindromeStrings {
    public static void main(String[] args) {
        ArrayList<String> givenList = new ArrayList<>();
        givenList.addAll(Arrays.asList(
                "Ma*dam", "adam", "murtaza", "Az#a"
        ));
        System.out.println(killThePalindromes(givenList));
    }

    public static ArrayList<String> killThePalindromes(ArrayList<String> list) {
        list.removeIf(p -> isPalindrome(p));
        return list;
    }

    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
                str = str.replace("" + ch, "");
            }
        }
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += "" + str.charAt(i);
        }
        return str.toLowerCase().equals(reverse.toLowerCase());
    }
}
