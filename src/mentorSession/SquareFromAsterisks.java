package mentorSession;

public class SquareFromAsterisks {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=6-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=6-i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=6-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <=5; i++) {
            for (int j = 6-i; j >=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("* ");
            }
            for (int k = 6-i; k >=1; k--) {
                System.out.print(k+" ");
            }

            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = 6-i; k >=1; k--) {
                System.out.print(k+" ");
            }

            System.out.println();
        }



    }
}
