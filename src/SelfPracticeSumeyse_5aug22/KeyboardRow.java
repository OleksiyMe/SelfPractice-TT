package SelfPracticeSumeyse_5aug22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class KeyboardRow {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Hello", "Alaska", "Dad", "Peace"));
        System.out.println("typed in one row: " + typedInOneRow(list));
    }

    private static ArrayList<String> typedInOneRow(ArrayList<String> list) {

        ArrayList<String> result = new ArrayList<>();
        for (String eachWord : list) {
            if (typedInOneRow(eachWord.toLowerCase()))
                result.add(eachWord);
        }
        return result;
    }

    private static boolean typedInOneRow(String word) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        boolean result=true;

        for (String eachRow : rows) {
            result = true;
            for (char ch : word.toCharArray()) {
                if (!eachRow.contains("" + ch)) {
                    result = false;
                    break;
                }
            }
            if (result) return result;

        }
        return result;
    }
}
