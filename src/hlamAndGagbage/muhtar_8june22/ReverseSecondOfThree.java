package hlamAndGagbage.muhtar_8june22;

public class ReverseSecondOfThree {
    public static void main(String[] args) {
        String str = "I Love Java";
        String[] strArray = str.split(" ");
        str = "";
        for (int i = strArray[1].length() - 1; i >= 0; i--) {
            str += strArray[1].charAt(i);
        }
        strArray[1] = str;
        for (String each : strArray) {
            System.out.print(each+" ");
        }
     }
}
