package mentorSession.mentorSession22june22_palindrome;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str="";
        do {
            System.out.println("\nType your word human and hit the Enter! (type STOP to end the program)");
            str = scan.nextLine();
            str = str.toLowerCase().trim();
            String reverse = "";
            int counterOfDigits = 0;

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += "" + str.charAt(i);
                // Character ch=str.charAt(i);
                if (Character.isDigit(str.charAt(i))) counterOfDigits++;
            }
            System.out.println("Your word is \"" + str + "\". Reverse is \"" + reverse + "\".");
            if (str.isBlank()) {
                System.out.print(true);
                System.out.print(" You are boring!");
                continue;
            }
            if (str.equals(reverse) && str.length() == counterOfDigits) {
                System.out.println(true +
                        " But all of them are digits. Give me the word!");
                continue;
            } else if (str.length() == counterOfDigits) {
                System.out.println(false + " Don't do your tricks on me!");
                continue;
            }
            if (str.equals(reverse)) System.out.println(true + " It's a true palindrome! Precious! :)");
            else System.out.println(false + " It's just a word. We have them millions. :(");
        } while (!str.equals("STOP"));
    scan.close();
    }
}
