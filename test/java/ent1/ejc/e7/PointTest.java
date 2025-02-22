package ent1.ejc.e7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void testPointConstructor() {
        Point point = new Point(3, 4);
        assertEquals(3, point.getX());
        assertEquals(4, point.getY());
    }

    @Test
    public void testSetX() {
        Point point = new Point(0, 0);
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    public void testSetY() {
        Point point = new Point(0, 0);
        point.setY(6);
        assertEquals(6, point.getY());
    }

    @Test
    public void testSetXY() {
        Point point = new Point(0, 0);
        point.setXY(7, 8);
        assertEquals(7, point.getX());
        assertEquals(8, point.getY());
    }

    @Test
    public void testToString() {
        Point point = new Point(9, 10);
        assertEquals("(9,10)", point.toString());
    }
}