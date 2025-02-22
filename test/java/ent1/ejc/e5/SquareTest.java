package ent1.ejc.e5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void testSquareDefaultConstructor() {
        Square square = new Square();
        assertEquals(1.0d, square.getSide(), 0.001);
        assertEquals("red", square.getColor()); // Asumiendo que el color por defecto es "red"
        assertTrue(square.isFilled()); // Asumiendo que el valor por defecto es true
    }

    @Test
    public void testSquareConstructorWithSide() {
        Square square = new Square(2.5d);
        assertEquals(2.5d, square.getSide(), 0.001);
    }

    @Test
    public void testSquareConstructorWithAllValues() {
        Square square = new Square(3.5d, "blue", false);
        assertEquals(3.5d, square.getSide(), 0.001);
        assertEquals("blue", square.getColor());
        assertFalse(square.isFilled());
    }

    @Test
    public void testSetSide() {
        Square square = new Square();
        square.setSide(4.5d);
        assertEquals(4.5d, square.getSide(), 0.001);
    }

    @Test
    public void testSetWidth() {
        Square square = new Square();
        square.setWidth(5.5d);
        assertEquals(5.5d, square.getSide(), 0.001);
    }

    @Test
    public void testSetLength() {
        Square square = new Square();
        square.setLength(6.5d);
        assertEquals(6.5d, square.getSide(), 0.001);
    }

    @Test
    public void testToString() {
        Square square = new Square(2.0d, "yellow", true);
        assertEquals("Square [Rectangle [Shape[color='yellow', filled=true], width=2.0, length=2.0]]", square.toString());
    }
}