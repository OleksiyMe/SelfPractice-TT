package hlamAndGagbage.Muhtar23june22;

public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            System.err.println("Side can not be negative");
            System.exit(1);
        }

        this.side = side;
    }

    public Square(double side) {
        setSide(side);
    }

    public double calcArea() {
        return side * side;
    }

    public double calcPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                " area=" + calcArea() +
                " perimeter=" + calcPerimeter() +
                '}';
    }
}
