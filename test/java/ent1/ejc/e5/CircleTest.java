package ent1.ejc.e5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void testCircleDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0d, circle.getRadius(), 0.001);
        assertEquals("red", circle.getColor()); // Asumiendo que el color por defecto es "red"
        assertTrue(circle.isFilled()); // Asumiendo que el valor por defecto es true
    }

    @Test
    public void testCircleConstructorWithRadius() {
        Circle circle = new Circle(2.5d);
        assertEquals(2.5d, circle.getRadius(), 0.001);
    }

    @Test
    public void testCircleConstructorWithAllValues() {
        Circle circle = new Circle(3.5d, "blue", false);
        assertEquals(3.5d, circle.getRadius(), 0.001);
        assertEquals("blue", circle.getColor());
        assertFalse(circle.isFilled());
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
    public void testSetFilled() {
        Circle circle = new Circle();
        circle.setFilled(false);
        assertFalse(circle.isFilled());
    }

    @Test
    public void testToString() {
        Circle circle = new Circle(5.5d, "yellow", true);
        assertEquals("Circle [Shape[color='yellow', filled=true], radius=5.5]", circle.toString());
    }
}