package mentorSession;

import java.util.Scanner;

public class TheFirstNonRepeatingVovel {
    public static void main(String[] args) {
        System.out.println("Enter your string?");
        String str = new Scanner(System.in).nextLine();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {  //Outer Loop. Picking a vowel (a,e,i,o,u)
            int count = 0;
            char current = str.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == current)  //Inner Loop. Counting a frequency of current vowel appearance
                        count++;
                }
                if (count > 1) {
                    result = -1;
                    continue;
                }  //Vowel appeared more than once
                else if (count == 1) {
                    result = i;
                    break;//Vowel appeared once and for the first time
                }
            } else result = -1;
        }
        System.out.println("The index of first non-repeating vowel is " + result);


    }
}
      /* System.out.println("Enter your string?");
        String str = new Scanner(System.in).nextLine();
        System.out.println("The index of first non-repeating vowel is " + firstNonRepVow(str));
    }
    public static int firstNonRepVow(String str) {

        for (int i = 0; i < str.length(); i++) {  //Outer Loop. Picking a vowel (a,e,i,o,u)
            int count = 0;
            char current = str.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == current)  //Inner Loop. Counting a frequency jf current vowel appearance
                        count++;
                }
                if (count > 1) continue;  //Vowel appeared more than once
                else if (count == 1) return i; //Vowel appeared once and for the first time
            }
        }
        return -1;                          //Node of vowels appeared or appeared just once*/
// }

