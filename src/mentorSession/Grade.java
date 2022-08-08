package mentorSession;

public class Grade {
    public static void main(String[] args) {

        int grade = 60;

        if (grade>=0&&grade<=100) {
            if (grade >= 90) System.out.println("Escelent");
            else if (grade >= 70) System.out.println("Good");
            else if (grade >= 60) System.out.println("Pass");
            else System.out.println("Fail");
        } else System.out.println("Out of scope");


    }
}
