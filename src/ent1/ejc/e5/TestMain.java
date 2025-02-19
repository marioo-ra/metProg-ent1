package ent1.ejc.e5;

public class TestMain {
    public static void main(String[] args) {
// Constructor test
        Shape shape = new Shape("blue", false);
        System.out.println(shape);
        Circle circle = new Circle(3);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println(rectangle);
        Square square = new Square(3);
        System.out.println(square);

// Getter's y setter's test
        System.out.println("color is: " + shape.getColor());
        System.out.println(circle.isFilled());
        System.out.println("radius is: " + circle.getRadius());
        System.out.println("area is: " + rectangle.getArea());
        System.out.println("perimeter is: " + rectangle.getPerimeter());
        System.out.println("width is: " + rectangle.getWidth());
        System.out.println("length is: " + rectangle.getLength());
        System.out.println("side is: " + square.getSide());
        System.out.println(square.getArea());
        System.out.println(square.getColor());
    }
}
