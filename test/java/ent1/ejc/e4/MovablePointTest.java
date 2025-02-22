package ent1.ejc.e4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovablePointTest {

    @Test
    public void testMovablePointDefaultConstructor() {
        MovablePoint point = new MovablePoint();
        assertEquals(0.0f, point.getX(), 0.001);
        assertEquals(0.0f, point.getY(), 0.001);
        assertEquals(0.0f, point.getXSpeed(), 0.001);
        assertEquals(0.0f, point.getYSpeed(), 0.001);
    }

    @Test
    public void testMovablePointConstructorWithSpeed() {
        MovablePoint point = new MovablePoint(1.5f, 2.5f);
        assertEquals(0.0f, point.getX(), 0.001);
        assertEquals(0.0f, point.getY(), 0.001);
        assertEquals(1.5f, point.getXSpeed(), 0.001);
        assertEquals(2.5f, point.getYSpeed(), 0.001);
    }

    @Test
    public void testMovablePointConstructorWithValues() {
        MovablePoint point = new MovablePoint(3.5f, 4.5f, 1.5f, 2.5f);
        assertEquals(0.0f, point.getX(), 0.001);
        assertEquals(0.0f, point.getY(), 0.001);
        assertEquals(1.5f, point.getXSpeed(), 0.001);
        assertEquals(2.5f, point.getYSpeed(), 0.001);
    }

    @Test
    public void testSetXSpeed() {
        MovablePoint point = new MovablePoint();
        point.setXSpeed(3.5f);
        assertEquals(3.5f, point.getXSpeed(), 0.001);
    }

    @Test
    public void testSetYSpeed() {
        MovablePoint point = new MovablePoint();
        point.setYSpeed(4.5f);
        assertEquals(4.5f, point.getYSpeed(), 0.001);
    }

    @Test
    public void testSetSpeed() {
        MovablePoint point = new MovablePoint();
        point.setSpeed(5.5f, 6.5f);
        assertArrayEquals(new float[]{5.5f, 6.5f}, point.getSpeed(), 0.001f);
    }

    @Test
    public void testToString() {
        MovablePoint point = new MovablePoint(1.5f, 2.5f, 3.5f, 4.5f);
        assertEquals("(0.0, 0.0), speed=(3.5,4.5)", point.toString());
    }
}