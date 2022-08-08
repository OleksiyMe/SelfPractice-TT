package hlamAndGagbage.muhtar3rdJuly22.shapesAbstraction;

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
    public Shape() {
        setName(getClass().getSimpleName());
    }
    public abstract double perimeter();
    public abstract double area();
    public abstract void draw();
    @Override
    public String toString() {
        return name+"{" +
                "name='" + name + '\'' +
                '}';
    }
}
