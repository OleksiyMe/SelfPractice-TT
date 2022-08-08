package mentorSession;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = new Random().nextInt(100) + 1;

        for (int i = 1; i > 0; i++) {
            if (i == 1) System.out.println("I have a secret number. Guess what is it (from 1 to 100)?");
            else System.out.println("Let us try once more");
            int getNum = scan.nextInt();
            if (getNum == number) {
                System.out.println("Right!! Unbelievable, you've done it in " + i + " tries.");
                return;
            } else if (getNum > number) {
                System.out.println("Your number is too big");
                continue;
            } else {
                System.out.println("Your number is too small");
                continue;
            }
        }
    }
}
