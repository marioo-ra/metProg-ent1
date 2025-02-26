package ent1.ejc.e5;

public class TestMain {
    public static void main(String[] args) {
// creas una figura de color azul que no esté rellena
        Shape shape = new Shape("blue", false);
// muestras por pantalla la información de la figura
        System.out.println(shape);
// creas un círculo de radio 3
        Circle circle = new Circle(3);
// muestras por pantalla la información de la figura
        System.out.println(circle);
// creas un rectángulo de anchura 4 y altura 6
        Rectangle rectangle = new Rectangle(4,6);
// muestras por pantalla la información de la figura
        System.out.println(rectangle);
// creas un cuadrado de lado 3
        Square square = new Square(3);
// muestras por pantalla la información de la figura
        System.out.println(square);

// muestra por pantalla el color de la figura
        System.out.println("color is: " + shape.getColor());
// imprime verdadero si la figura está rellena o falso si no lo está
        System.out.println(circle.isFilled());
// muestra por pantalla el radio del círculo
        System.out.println("radius is: " + circle.getRadius());
// muestra por pantalla el área, perímetro, anchura y altura del rectángulo
        System.out.println("area is: " + rectangle.getArea());
        System.out.println("perimeter is: " + rectangle.getPerimeter());
        System.out.println("width is: " + rectangle.getWidth());
        System.out.println("length is: " + rectangle.getLength());
//  muestra por pantalla el lado, área y color del cuadrado
        System.out.println("side is: " + square.getSide());
        System.out.println(square.getArea());
        System.out.println(square.getColor());
    }
}
