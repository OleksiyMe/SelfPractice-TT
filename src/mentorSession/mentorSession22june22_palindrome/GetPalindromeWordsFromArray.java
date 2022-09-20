package mentorSession.mentorSession22june22_palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GetPalindromeWordsFromArray {
    public static void main(String[] args) {
        String[] array = {"abc", "car", "ada", "  racecar  ", "  cool  ", "abba  ", "", "1111"};
        System.out.println(arrayListWithPalindromes(array));
    }

    public static ArrayList<String> arrayListWithPalindromes(String[] array) {
        ArrayList<String> result = new ArrayList<>();
        for (String each : array) {
            if (isPalindrome(each)) {
                result.add(each);
            }
        }
        return result;
    }

    public static boolean isPalindrome(String sent) {
        sent = sent.toLowerCase().replace(" ", "");
        String[] newArr = sent.split("");
        String[] sentArr = sent.split("");
        Collections.reverse(Arrays.asList(sentArr));
        return Arrays.toString(newArr).equals(Arrays.toString(sentArr));
    }
}
