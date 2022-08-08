package SelfPraciceSumeyse_25july22;

import java.util.SortedMap;

public class DNAtoRNA {

    public static void main(String[] args) {
        String givenDNA="GGCCATGTCAT";
        System.out.println("If DNA is "+givenDNA+"\nthen RNA is "+convertDNAtoRNA(givenDNA));
    }

    public static String convertDNAtoRNA(String DNA){
        return DNA.replace("T","U");
    }
}
