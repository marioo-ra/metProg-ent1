package ent1.ejc.e8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testCircleDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(2.0d, circle.getRadius(), 0.001);
        assertEquals("red", circle.getColor());
    }

    @Test
    public void testCircleConstructorWithValues() {
        Circle circle = new Circle(3.5d, "blue");
        assertEquals(3.5d, circle.getRadius(), 0.001);
        assertEquals("blue", circle.getColor());
    }

    @Test
    public void testSetRadius() {
        Circle circle = new Circle();
        circle.setRadius(4.5d);
        assertEquals(4.5d, circle.getRadius(), 0.001);
    }

    @Test
    public void testSetColor() {
        Circle circle = new Circle();
        circle.setColor("green");
        assertEquals("green", circle.getColor());
    }

    @Test
    public void testGetArea() {
        Circle circle = new Circle(3.0d, "yellow");
        assertEquals(Math.PI * 3.0 * 3.0, circle.getArea(), 0.001);
    }

    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle(3.0d, "yellow");
        assertEquals(2 * Math.PI * 3.0, circle.getPerimeter(), 0.001);
    }

    @Test
    public void testToString() {
        Circle circle = new Circle(3.0d, "yellow");
        assertEquals("Circle[radius=3.0, color='yellow']", circle.toString());
    }
}