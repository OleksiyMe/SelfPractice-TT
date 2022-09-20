package mentorSession.mentorSession_Foxes;

public class WorkWithFoxes {
    public static void main(String[] args) {

        for (Fox each : new DatabaseOfFoxes().getAllFoxes()) {
            checkHimOut(each);
        }
    }

    public static void checkHimOut(Fox foxyFox) {
        if (foxyFox.wearsCoat && foxyFox.coatColor == "BLACK" && foxyFox.hasATorch && foxyFox.bagCount == 3)
            System.out.println(foxyFox + " is a suspect!");
        else System.out.println(foxyFox + " cleared of charges!");
    }
}
