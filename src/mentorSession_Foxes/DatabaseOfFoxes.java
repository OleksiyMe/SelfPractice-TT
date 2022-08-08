package mentorSession_Foxes;

public class DatabaseOfFoxes {
    Fox[] boxOfFoxes = {
            new Fox("Fox1", true, true, "BLACK", 0),
            new Fox("Fox2", true, true, "BLACK", 2),
            new Fox("Fox9", false, true, "GRAY", 3),
            new Fox("Fox10", false, true, "GRAY", 3),
            new Fox("Fox11", false, true, "GRAY", 3),
            new Fox("Fox12", false, true, "GRAY", 3),
            new Fox("Fox13", false, true, "GRAY", 3),
            new Fox("Fox14", false, true, "GRAY", 3),
            new Fox("Fox15", true, true, "BLACK", 3),
            new Fox("Fox16", true, true, "BLACK", 3),
            new Fox("Fox20", true, true, "BLACK", 3),
            new Fox("Fox28", true, true, "BLACK", 3),
            new Fox("Fox30", true, true, "BLACK", 3),
    };
    public Fox[] getAllFoxes(){
        return boxOfFoxes;
    }
}
