package hlamAndGagbage.Muhtar23june22;

public class Circle {

    private double radius;
    public static double pi;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Radius can not be <=0");
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea(){
        return pi*radius*radius;
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                " area=" + calcArea() +
                " perimeter=" + calcPerimeter() +
                '}';
    }

}
