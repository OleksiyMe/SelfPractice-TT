package mentorSession22june22_palindrome;

public class MinAndMaxFromIntAllay {
    public static void main(String[] args) {
        String str = "1 2 3 4 5";
        System.out.println(hiAndLow(str));
    }
    public static String hiAndLow(String str) {
        String[] array = str.split(" ");
        int min = Integer.parseInt(array[0]), max = min;
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i]) > max) max = Integer.parseInt(array[i]);
            if (Integer.parseInt(array[i]) < min) min = Integer.parseInt(array[i]);
        }
        return max + " " + min;
    }
}
