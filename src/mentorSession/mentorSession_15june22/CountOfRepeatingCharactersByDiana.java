package mentorSession.mentorSession_15june22;
import java.util.ArrayList;
import java.util.Scanner;
public class CountOfRepeatingCharactersByDiana {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();

        countCharacters(str);
    }

    public static void countCharacters(String str){
        ArrayList<String> arr = new ArrayList<>();

        String result = "";
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count > 1 && !arr.contains("" + str.charAt(i))){
                arr.add("" + str.charAt(i));
                result += str.charAt(i) + " ";
            }
        }
        if(arr.size() == 0){
            System.out.println("No characters repeated");
        } else {
            System.out.println(arr.size() + " letters: " + result);

        }
    }


}
