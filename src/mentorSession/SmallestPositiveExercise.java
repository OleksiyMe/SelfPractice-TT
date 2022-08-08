package mentorSession;

public class SmallestPositiveExercise {
    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            if (i % 7 == 0 && i % 15 == 0 && i % 10 != 0) {
                System.out.println(i + " is the smallest 3-digit divisible by 7 and 15 but not 10");
                return;
            }
        }
    }
}
