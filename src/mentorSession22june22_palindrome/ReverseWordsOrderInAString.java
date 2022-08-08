package mentorSession22june22_palindrome;

public class task {
    public static void main(String[] args) {
        String str = " I     have    a    dream   ";
        for (; ; ) {
            str = str.replace("  ", " ");
            if (!str.contains("  ")) break;
        }

        String[] array = str.split(" ");
        String result = "";

        for (int i = array.length - 1; i >= 0; i--) {
            result += "" + array[i] + " ";
        }
        System.out.println(result.trim());
    }
}
