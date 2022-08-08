package hlamAndGagbage.muhtar3rdJuly22;

public abstract class Shape {
    private String name;

    public final static double pi;

    static{
        pi=3.14;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
