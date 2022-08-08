package SelfPraciceSumeyse_25july22;

public class NextPerfectSquare {
    public static void main(String[] args) {
        int givenNum = 121;
        System.out.println(
                nextPerfectSquare(givenNum)
        );
    }
    public static int nextPerfectSquare(int num) {
        if (isItAPerfectSquare(num)) {
            return (int) Math.pow(Math.sqrt(num) + 1, 2);
        }
        return -1;
    }
    public static boolean isItAPerfectSquare(int num) {

        if (Math.sqrt(num) % 1 == 0) return true;
        return false;
    }
}
