package SelfPracticeSumeyse_11aug22;

public class JudgeRouteCircle3 {
    public static void main(String[] args) {

        String input = "LLUDR";
        System.out.println("Is it makes a circle? " + isItBack(input));
    }

    private static boolean isItBack(String input) {
        int xAxis = 0, yAxis = 0;
        Integer[] currentPosition = {0, 0};
        for (char ch : input.toCharArray()) {
            if (ch == 'R') xAxis++;
            if (ch == 'L') xAxis--;
            if (ch == 'U') yAxis++;
            if (ch == 'D') yAxis--;
        }
        return (xAxis == 0 && yAxis == 0);
    }
}
