package ent1.ejc.e1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

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

    @Test
    public void testCylinderDefaultConstructor() {
        Cylinder cylinder = new Cylinder();
        assertEquals(1.0, cylinder.getRadius(), 0.001);
        assertEquals("red", cylinder.getColor());
        assertEquals(1.0, cylinder.getHeight(), 0.001);
    }

    @Test
    public void testCylinderConstructorWithRadius() {
        Cylinder cylinder = new Cylinder(5.0);
        assertEquals(5.0, cylinder.getRadius(), 0.001);
        assertEquals("red", cylinder.getColor());
        assertEquals(1.0, cylinder.getHeight(), 0.001);
    }

    @Test
    public void testCylinderConstructorWithRadiusAndHeight() {
        Cylinder cylinder = new Cylinder(3.5, 7.0);
        assertEquals(3.5, cylinder.getRadius(), 0.001);
        assertEquals(7.0, cylinder.getHeight(), 0.001);
    }

    @Test
    public void testCylinderConstructorWithRadiusHeightAndColor() {
        Cylinder cylinder = new Cylinder(3.5, 7.0, "blue");
        assertEquals(3.5, cylinder.getRadius(), 0.001);
        assertEquals(7.0, cylinder.getHeight(), 0.001);
        assertEquals("blue", cylinder.getColor());
    }

    @Test
    public void testCylinderSetHeight() {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5.0);
        assertEquals(5.0, cylinder.getHeight(), 0.001);
    }

    @Test
    public void testCylinderGetVolume() {
        Cylinder cylinder = new Cylinder(2.0, 5.0);
        assertEquals(Math.PI * 4.0 * 5.0, cylinder.getVolume(), 0.001);
    }

    @Test
    public void testCylinderToString() {
        Cylinder cylinder = new Cylinder(2.0, 5.0, "yellow");
        assertEquals("Cylinder [base=Circle[radius=2.0, color='yellow]height=5.0]", cylinder.toString());
    }
}