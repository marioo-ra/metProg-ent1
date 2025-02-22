package ent1.ejc.e5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    public void testShapeDefaultConstructor() {
        Shape shape = new Shape();
        assertEquals("red", shape.getColor());
        assertTrue(shape.isFilled());
    }

    @Test
    public void testShapeConstructorWithValues() {
        Shape shape = new Shape("blue", false);
        assertEquals("blue", shape.getColor());
        assertFalse(shape.isFilled());
    }

    @Test
    public void testSetColor() {
        Shape shape = new Shape();
        shape.setColor("green");
        assertEquals("green", shape.getColor());
    }

    @Test
    public void testSetFilled() {
        Shape shape = new Shape();
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @Test
    public void testToString() {
        Shape shape = new Shape("yellow", true);
        assertEquals("Shape[color='yellow', filled=true]", shape.toString());
    }
}