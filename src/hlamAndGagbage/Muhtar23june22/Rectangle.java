package hlamAndGagbage.Muhtar23june22;

public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            System.err.println("width can not be negative " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
    return width;
    }

    public void setLength(double length) {
        if (length < 0) {
            System.err.println("length can not be negative " + length);
            System.exit(1);
        }
        this.length=length;
    }

    public double calcArea() {
        return width * length;
    }

    public double calcPerimeter() {
        return 2*(width + length);
    }


    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}