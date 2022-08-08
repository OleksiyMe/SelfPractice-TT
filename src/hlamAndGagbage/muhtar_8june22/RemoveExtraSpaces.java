package hlamAndGagbage.muhtar_8june22;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java ";
        while (str.contains("  ")) str=str.replace("  "," ");
        System.out.println(str.trim());
  }
}
