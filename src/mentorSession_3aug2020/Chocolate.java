package mentorSession_3aug2020;

public class Chocolate {
    public static void main(String[] args) {

        int length = 7, width = 3;
        System.out.println("For splitting " + length + "x" + width + " chocolate bar we need " +
                breakes(length, width) + " breaks.");
    }

    private static int breakes(int length, int width) {

        if (length == 0 || width == 0) return 0;
        return (length - 1) + (width - 1);
    }
}
