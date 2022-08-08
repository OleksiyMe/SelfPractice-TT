package hlamAndGagbage.muhtar_8june22;


public class AnagramTask {
    public static void main(String[] args) {
        String str1 = "aab",
                str2 = "baa";
        int count1 = 0, count2 = 0;
        boolean result = false;

        for (char each1 : str1.toCharArray()) {
            //int i=1;
            for (char each2 : str2.toCharArray()) {
                if (each1 == each2) count2++;
          //  i++;
            }
        }
        for (char each2 : str2.toCharArray()) {
            for (char each1 : str1.toCharArray()) {
                if (each1 == each2) count1++;
            }
        }
        if (count2 == str2.length() && count1 == str1.length()) result = true;
        System.out.println("result = " + result);

    }
}
