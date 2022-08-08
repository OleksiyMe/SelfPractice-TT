package muhtar_june;

public class CounntPalindromesInArrayOfString {
    public static void main(String[] args) {
        String[] array = {"Aba", "a", "bravo", "", "abba", "    ", "11"};
        int palindromeCounter = 0;
        for (String each : array) {
            if (checkForPal(each)) palindromeCounter++;
        }
        System.out.println("palindromeCounter = " + palindromeCounter);
    }

    private static boolean checkForPal(String each) {
        /* ""-- not palindrome
        just one char -- not a palindrome
         "     " (bunch of blanks -- not a palindrome*/
        if (each.length() == 1 ||each.isBlank()) return false;
        String reverse = "";
        for (int i = each.length() - 1; i >= 0; i--) {
            reverse += each.charAt(i);
        }
        if (each.equalsIgnoreCase(reverse)) return true;
        else return false;
    }
}
