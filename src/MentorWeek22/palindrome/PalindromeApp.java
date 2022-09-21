package MentorWeek22.palindrome;

public class PalindromeApp {
    public static void main(String[] args) {
        String given ="Do geese see God?";
        System.out.println("Does given string \""+given + "\" a palindrome?\n"+
                isPalindrome(given) );
    }
    private static boolean isPalindrome(String given) {
        MyDoubleLinkedList<Character> list =new MyDoubleLinkedList();
        for (char ch : given.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(ch)) list.add(ch);
        }
      /*  System.out.println( "Typing forward: "+list);
        System.out.println("Typing reverse: "+list.toStringReverse());*/
        return list.toString().equals(list.toStringReverse());
    }
}
