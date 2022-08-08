package SelfPracticeSumeyse_5aug22;

public class AttendanceRecord {
    public static void main(String[] args) {

        String days = "PPALL";
        System.out.println("Thi student could be rewarded: " + calculate(days));
    }

    private static boolean calculate(String days) {

        boolean absent = false, late = false;
        if ((days.replace("A", "A1").length() - days.length()) <= 1) absent = true;
        if (!days.contains("LLL")) late = true;
        return absent && late;
    }
}
