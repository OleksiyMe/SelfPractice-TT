package hlamAndGagbage;

public class ThreeInARow {
    public static void main(String[] args) {

        String str = "wrqwrrtrrqqq eee";

        for (int i = 0; i <=str.length() - 4; i++) {

            char currentChar = str.charAt(i);
            for (int j = 1; j <= 3; j++) {
                if (currentChar == str.charAt(i + j) && j == 3) {
                    System.out.println("3 char in a row!!");
                    break;
                } else if (currentChar == str.charAt(i + j)) continue;
                else break;
            }

        }

    }


}


