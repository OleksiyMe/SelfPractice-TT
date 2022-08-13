package SelfPracticeSumeyse_11aug22;

public class JudgeRouteCircle2 {

    public static void main(String[] args) {

        String input = "LLUDRR";
        System.out.println("Is it makes a circle? " + isItBack(input));
    }

    private static boolean isItBack(String input) {

        return (
                (input.replace("R", "R1").length() - input.length()) ==
                        (input.replace("L", "L1").length() - input.length()) &&
                        (input.replace("U", "U1").length() - input.length()) ==
                                (input.replace("D", "D1").length() - input.length())
        );
    }

}
