package mentorSession22june22_palindrome;

public class MinAndMaxFromIntArray {
    public static void main(String[] args) {
        String str = "1 2 -100 4 5 999";
        System.out.println(hiAndLow(str));
    }

    public static String hiAndLow(String str) {
        String[] array = str.split(" ");
        //      int min = Integer.parseInt(array[0]), max = min;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int each = Integer.parseInt(array[i]);
            if (each > max) max = each;
            if (each < min) min = each;
        }
        return max + " " + min;
    }
}
