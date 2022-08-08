package hlamAndGagbage.muhtar3rdJuly22.shapesAbstraction;

public class TestShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        System.out.println(circle);
        circle.draw();

        Square square = new Square(10);
        System.out.println(square);
        square.draw();

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);
        rectangle.draw();

    }
}
