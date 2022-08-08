package muhtar_june;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java ";
        while (str.contains("  ")) str=str.replace("  "," ");
        System.out.println(str.trim());
  }
}
