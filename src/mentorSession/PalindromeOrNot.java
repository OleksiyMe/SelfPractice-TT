package mentorSession;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {

        System.out.println("Give me the int number. I'll check if it palindrome or not?");
        int number = new Scanner(System.in).nextInt();
        /*number < 0-- not palindrome
        number % 10 == 0 ( if number ends with 0)--not a palindrome
        0-- not a palindrome*/

        if (number < 0 || number % 10 == 0 || number == 0) {
            System.out.println("Your number is not a palindrome");
            return;
        }

        int reverseNumber = 0;

        for (int tmpNumber = number; tmpNumber > 0; tmpNumber /= 10) {
            reverseNumber = reverseNumber * 10 + tmpNumber % 10;
        }

        System.out.println("Your number = " + number);
        System.out.println("Reverse number = " + reverseNumber);
        if (number == reverseNumber) System.out.println("It's a palindrome!");
        else System.out.println("Your number is not a palindrome!");

    }
}


