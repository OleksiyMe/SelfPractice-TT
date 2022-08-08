package hlamAndGagbage.muhtar3rdJuly22.shapesAbstraction;

public class Square extends Shape {
    private double side;
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public Square(double side) {
        setSide(side);
    }
    @Override
    public double perimeter() {
        return 4 * side;
    }
    @Override
    public double area() {
        return side * side;
    }
    @Override
    public void draw() {
        System.out.println("* * * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("*           *");
        }
        System.out.println("* * * * * * *");
    }
    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", side=" + side +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
