package SelfPracticeSumeyse_5aug22;

public class MumblingAccumul {
    public static void main(String[] args) {
        String str = "Google";
        System.out.println(startMumbling(str));
    }

    private static String startMumbling(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ch = Character.isUpperCase(ch) ? ch : Character.toUpperCase(ch);
            builder.append(ch);
            ch = Character.toLowerCase(ch);
            builder.append(("" + ch).repeat(i)+"-");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();



       /* String result = "";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            result += ("" + arr[i]).toUpperCase();
            result += ("" + arr[i]).toLowerCase().repeat(i);
            result += "-";
        }
        return result.substring(0, result.length() - 1);*/
    }
}
