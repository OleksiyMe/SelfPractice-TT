package mentorSession.mentor_16nov2022;

public class AboutString {
    public static void main(String[] args) {

        String s1 = new String("Java");
        String s2 = new String("Java");
        String sLiteral1="Java";
        String sLiteral2="Java";
        System.out.println("Is s1 == s2? - " + (s1==s2));
        System.out.println("Is s1.equals(s2) ? "+s1.equals(s2));
        System.out.println( (s1+s2)==("JavaJava")  );

        System.out.println("sLiteral1==sLiteral2 : "+(sLiteral1==sLiteral2));
        System.out.println( "(sLiteral1+sLiteral2)==(sLiteral1+sLiteral2) : "
                +(sLiteral1+sLiteral2)==(sLiteral1+sLiteral2)  );
        System.out.println( ("Java"+"Java")==("Java"+"Java"));
        System.out.println( (sLiteral1+sLiteral2)==("Java"+"Java"));


        System.out.println(new String( new char[]{'a','b'})  );


    }
}
