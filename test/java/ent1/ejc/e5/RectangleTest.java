package ent1.ejc.e5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testRectangleDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0d, rectangle.getWidth(), 0.001);
        assertEquals(1.0d, rectangle.getLength(), 0.001);
        assertEquals("red", rectangle.getColor()); // Asumiendo que el color por defecto es "red"
        assertTrue(rectangle.isFilled()); // Asumiendo que el valor por defecto es true
    }

    @Test
    public void testRectangleConstructorWithWidthAndLength() {
        Rectangle rectangle = new Rectangle(2.5d, 3.5d);
        assertEquals(2.5d, rectangle.getWidth(), 0.001);
        assertEquals(3.5d, rectangle.getLength(), 0.001);
    }

    @Test
    public void testRectangleConstructorWithAllValues() {
        Rectangle rectangle = new Rectangle(4.5d, 5.5d, "blue", false);
        assertEquals(4.5d, rectangle.getWidth(), 0.001);
        assertEquals(5.5d, rectangle.getLength(), 0.001);
        assertEquals("blue", rectangle.getColor());
        assertFalse(rectangle.isFilled());
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(6.5d);
        assertEquals(6.5d, rectangle.getWidth(), 0.001);
    }

    @Test
    public void testSetLength() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(7.5d);
        assertEquals(7.5d, rectangle.getLength(), 0.001);
    }

    @Test
    public void testSetColor() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("green");
        assertEquals("green", rectangle.getColor());
    }

    @Test
    public void testSetFilled() {
        Rectangle rectangle = new Rectangle();
        rectangle.setFilled(false);
        assertFalse(rectangle.isFilled());
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(2.0d, 3.0d);
        assertEquals(6.0d, rectangle.getArea(), 0.001);
    }

    @Test
    public void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(2.0d, 3.0d);
        assertEquals(10.0d, rectangle.getPerimeter(), 0.001);
    }

    @Test
    public void testToString() {
        Rectangle rectangle = new Rectangle(2.0d, 3.0d, "yellow", true);
        assertEquals("Rectangle [Shape[color='yellow', filled=true], width=2.0, length=3.0]", rectangle.toString());
    }
}