package ent1.ejc.e8;

public class TestMain {
    public static void main(String[] args) {
// Constructor test
        Circle circle = new Circle();
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

// Getter's y setter's test
        System.out.println("area is: " + circle.getArea());
        System.out.println("perimeter is: " + circle.getPerimeter());
        System.out.println("volume is: " + cylinder.getVolume());

    }
}
