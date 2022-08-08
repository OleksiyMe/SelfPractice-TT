package hlamAndGagbage.muhtar3rdJuly22.shapesAbstraction;

public class Rectangle extends Shape {
    private double width, length;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }
    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
    @Override
    public double area() {
        return width * length;
    }
    @Override
    public void draw() {
        System.out.println("* * * * * *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println("* * * * * *");
    }
    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", width=" + width +
                ", length=" + length +
                ", perimeter=" + perimeter() +
                ", area=" + area() +

                '}';
    }
}
