package mentorSession.mentorSession_15june22;

public class Sumeyse_CountingRepeatingChar {
    public static void main(String[] args) {
        String str ="aabbcc";

        System.out.println(getNumber(str));



    }




    public static int getNumber(String str) {
        str = str.toLowerCase();
        String temp = "";
        String output = "";
        for (char ch : str.toCharArray()) {
            if (!temp.contains(ch + "")) {
                temp += ch;
            } else if (!output.contains(ch + "")) {
                output += ch;
            }
        }
        return output.length();
    }
}
