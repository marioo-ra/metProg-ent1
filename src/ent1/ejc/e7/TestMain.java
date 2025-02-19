package ent1.ejc.e7;

public class TestMain {
    public static void main(String[] args) {
// Constructor test
        Point p1 = new Point(10, 20);
        System.out.println(p1);
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        Point begin = new Point(2,2);
        Point end = new Point(5,5);
        Line l2 = new Line(begin, end);
        System.out.println(l2);

// Getter's y setter's test
        p1.setXY(100,10);
        System.out.println (p1);
    }
}
