package ent1.ejc.e3;

public class TestMain {
    public static void main(String[] args) {
// Constructor test
        Point2D p1 = new Point2D();
        System.out.println(p1);
        Point2D p2 = new Point2D(5f,5f);
        System.out.println(p2);
        Point3D p3 = new Point3D();
        System.out.println(p3);
        Point3D p4 = new Point3D(1f,1f,1f);
        System.out.println(p4);

// Getter's y setter's test
        System.out.println("x is: " + p4.getX());
        System.out.println("y is: " + p4.getY());
        System.out.println("z is: " + p4.getZ());
        System.out.println(p3.getXY()[3]);                     // ERROR
        System.out.println("point is: " + p4.getXYZ()[3]);     // ERROR
        p4.setXYZ(2,3,2);
        System.out.println(p3);
    }
}
