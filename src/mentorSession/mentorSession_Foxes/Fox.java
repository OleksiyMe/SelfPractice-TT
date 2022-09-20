package mentorSession.mentorSession_Foxes;

public class Fox {
    public String foxID;
    public boolean wearsCoat;
    public boolean hasATorch;
    public String coatColor;
    public int bagCount;

    public Fox(String foxID, boolean wearsCoat, boolean hasATorch, String coatColor, int bagCount) {
        this.foxID = foxID;
        this.wearsCoat = wearsCoat;
        this.hasATorch = hasATorch;
        this.coatColor = coatColor;
        this.bagCount = bagCount;
    }

    public String toString() {
        return foxID + " {" +
                "wearsCoat=" + wearsCoat +
                ", hasATorch=" + hasATorch +
                ", coatColor='" + coatColor + '\'' +
                ", bagCount=" + bagCount +
                '}';
    }
}
