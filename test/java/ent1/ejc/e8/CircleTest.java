package ent1.ejc.e8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testCircleDefaultConstructor() {
        Circle1 circle = new Circle1();
        assertEquals(2.0d, circle.getRadius(), 0.001);
        assertEquals("red", circle.getColor());
    }

    @Test
    public void testCircleConstructorWithValues() {
        Circle1 circle = new Circle1(3.5d, "blue");
        assertEquals(3.5d, circle.getRadius(), 0.001);
        assertEquals("blue", circle.getColor());
    }

    @Test
    public void testSetRadius() {
        Circle1 circle = new Circle1();
        circle.setRadius(4.5d);
        assertEquals(4.5d, circle.getRadius(), 0.001);
    }

    @Test
    public void testSetColor() {
        Circle1 circle = new Circle1();
        circle.setColor("green");
        assertEquals("green", circle.getColor());
    }

    @Test
    public void testGetArea() {
        Circle1 circle = new Circle1(3.0d, "yellow");
        assertEquals(Math.PI * 3.0 * 3.0, circle.getArea(), 0.001);
    }

    @Test
    public void testGetPerimeter() {
        Circle1 circle = new Circle1(3.0d, "yellow");
        assertEquals(2 * Math.PI * 3.0, circle.getPerimeter(), 0.001);
    }

    @Test
    public void testToString() {
        Circle1 circle = new Circle1(3.0d, "yellow");
        assertEquals("Circle[radius=3.0, color='yellow']", circle.toString());
    }
}