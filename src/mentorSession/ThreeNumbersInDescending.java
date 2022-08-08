package mentorSession;

import java.util.Random;

public class ThreeNumbersInDescending {
    public static void main(String[] args) {

        Random rnd = new Random();
        int n1 = rnd.nextInt(1000) + 1, n2 = rnd.nextInt(1000) + 1, n3 = rnd.nextInt(1000) + 1;
        int max1 = maxFrom(n1, n2, n3), max2 = 0;
        System.out.println("Numbers: " + n1 + ", " + n2 + ", " + n3);
        System.out.print("Numbers in descending order: " + max1 + ", ");

        if (n1 != max1 && n2 != max1) {
            max2 = maxFrom(n1, n2);
            System.out.print(max2 + ", ");
        } else if (n2 != max1 && n3 != max1) {
            max2 = maxFrom(n2, n3);
            System.out.print(max2 + ", ");
        } else {
            max2 = maxFrom(n1, n3);
            System.out.print(max2 + ", ");
        }

        if (n1 != max1 && n1 != max2) System.out.print(n1);
        else if (n2 != max1 && n2 != max2) System.out.print(n2);
        else System.out.print(n3);

    }
    public static int maxFrom(int a, int b) {
        if (a > b) return a;
        else return b;

    }
    public static int maxFrom(int a, int b, int c) {
        if (a > b & a > c) return a;
        else if (b > a && b > c) return b;
        else return c;

    }
}
