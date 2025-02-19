package ent1.ejc.e4;

public class TestMain {
    public static void main(String[] args) {
// Constructor test
        Point p1 = new Point();
        System.out.println(p1);
        Point p2 = new Point(2f,2f);
        System.out.println(p2);
        MovablePoint mp1 = new MovablePoint();
        System.out.println(mp1);
        MovablePoint mp2 = new MovablePoint(2f, 2f);
        System.out.println(mp2);
        MovablePoint mp3 = new MovablePoint(2f, 2f, 2f, 2f);
        System.out.println(mp3);

// Getter's y setter's test
        p1.setXY(1f, 1f);
        System.out.println(p1.getXY()[2]);
        mp1.setX(5);
        mp1.setY(5);
        mp1.setXSpeed(2);
        mp1.setYSpeed(2);
        System.out.println(mp1.getXY()[1]);
        System.out.println(mp1.getSpeed()[2]);

    }
}
