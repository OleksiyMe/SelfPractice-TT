package mentorSession22june22_palindrome;

public class ReverseWordsOrderInAString {
    public static void main(String[] args) {
        String str = " I     have    a    dream   ";
        while (str.contains("  ")) str = str.replace("  ", " ");
        String[] array = str.split(" ");
        String result = "";

        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i] + " ";
        }
        System.out.println(result.trim());
    }
}
