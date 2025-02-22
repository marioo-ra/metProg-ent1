package ent1.ejc.e4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void testPointDefaultConstructor() {
        Point point = new Point();
        assertEquals(0.0f, point.getX(), 0.001);
        assertEquals(0.0f, point.getY(), 0.001);
    }

    @Test
    public void testPointConstructorWithValues() {
        Point point = new Point(3.5f, 4.5f);
        assertEquals(3.5f, point.getX(), 0.001);
        assertEquals(4.5f, point.getY(), 0.001);
    }

    @Test
    public void testSetX() {
        Point point = new Point();
        point.setX(2.5f);
        assertEquals(2.5f, point.getX(), 0.001);
    }

    @Test
    public void testSetY() {
        Point point = new Point();
        point.setY(3.5f);
        assertEquals(3.5f, point.getY(), 0.001);
    }

    @Test
    public void testSetXY() {
        Point point = new Point();
        point.setXY(1.5f, 2.5f);
        assertArrayEquals(new float[]{1.5f, 2.5f}, point.getXY(), 0.001f);
    }

    @Test
    public void testToString() {
        Point point = new Point(1.5f, 2.5f);
        assertEquals("(1.5, 2.5)", point.toString());
    }
}