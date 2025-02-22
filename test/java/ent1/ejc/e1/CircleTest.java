package ent1.ejc.e1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), 0.001);
        assertEquals("red", circle.getColor());
    }

    @Test
    public void testConstructorWithRadius() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius(), 0.001);
        assertEquals("red", circle.getColor());
    }

    @Test
    public void testConstructorWithRadiusAndColor() {
        Circle circle = new Circle(3.5, "blue");
        assertEquals(3.5, circle.getRadius(), 0.001);
        assertEquals("blue", circle.getColor());
    }

    @Test
    public void testSetRadius() {
        Circle circle = new Circle();
        circle.setRadius(2.5);
        assertEquals(2.5, circle.getRadius(), 0.001);
    }

    @Test
    public void testSetColor() {
        Circle circle = new Circle();
        circle.setColor("green");
        assertEquals("green", circle.getColor());
    }

    @Test
    public void testGetArea() {
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * 4.0, circle.getArea(), 0.001);
    }

    @Test
    public void testToString() {
        Circle circle = new Circle(2.0, "yellow");
        assertEquals("Circle[radius=2.0, color='yellow]", circle.toString());
    }
}
