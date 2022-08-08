package mentorSession;
import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        System.out.println("Enter max speed");
        int sp = new Scanner(System.in).nextInt();

        if (sp>=200) {
            System.out.println("It's a good car");
            System.out.println(sp>=200);
        }
        else System.out.println("your car is a crap \n" +(sp>=200));



    }




}
