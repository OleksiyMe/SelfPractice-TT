package SelfPracticeSumeyse_5aug22;

public class CountSmileys {

    public static void main(String[] args) {
        // String str = ":)sdfsdfv:-D:D";
        String[] arr = {":)", ":("};
        //  System.out.println("Count of smiles is " + countSmiles(str));
        System.out.println("Count of smiles is " + countSmiles(arr));

    }

    private static int countSmiles(String str) {
        String[] smileExample = {":)", ":D", ":-)", ":-D", ":~)", ":~D", ";)", ";D", ";~)", ";~D", ";-)", ";-D"};
        int count = 0;
        for (String eachSmile : smileExample) {
            if (str.contains(eachSmile)) {
                count += str.replace(eachSmile, eachSmile + 1).length() - str.length();
            }
        }
        return count;
    }

    private static int countSmiles(String[] arr) {
        String str = "";
        for (String s : arr) {
            str += s;
        }
        return countSmiles(str);
    }
}
