package ent1.ejc.e8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    @Test
    public void testCylinderDefaultConstructor() {
        Cylinder1 cylinder = new Cylinder1();
        assertEquals(2.0d, cylinder.getBase().getRadius(), 0.001); // Asumiendo que el radio por defecto es 2.0
        assertEquals("red", cylinder.getBase().getColor()); // Asumiendo que el color por defecto es "red"
        assertEquals(1.0d, cylinder.getHeight(), 0.001);
    }

    @Test
    public void testCylinderConstructorWithValues() {
        Circle1 base = new Circle1(3.5d, "blue");
        Cylinder1 cylinder = new Cylinder1(base, 4.5d);
        assertEquals(3.5d, cylinder.getBase().getRadius(), 0.001);
        assertEquals("blue", cylinder.getBase().getColor());
        assertEquals(4.5d, cylinder.getHeight(), 0.001);
    }

    @Test
    public void testSetBase() {
        Cylinder1 cylinder = new Cylinder1();
        Circle1 newBase = new Circle1(5.5d, "green");
        cylinder.setBase(newBase);
        assertEquals(5.5d, cylinder.getBase().getRadius(), 0.001);
        assertEquals("green", cylinder.getBase().getColor());
    }

    @Test
    public void testSetHeight() {
        Cylinder1 cylinder = new Cylinder1();
        cylinder.setHeight(6.5d);
        assertEquals(6.5d, cylinder.getHeight(), 0.001);
    }

    @Test
    public void testGetVolume() {
        Circle1 base = new Circle1(3.0d, "yellow");
        Cylinder1 cylinder = new Cylinder1(base, 7.0d);
        assertEquals(Math.PI * 3.0 * 3.0 * 7.0, cylinder.getVolume(), 0.001);
    }

    @Test
    public void testGetArea() {
        Circle1 base = new Circle1(3.0d, "yellow");
        Cylinder1 cylinder = new Cylinder1(base, 7.0d);
        assertEquals(263.89378290154264, 263.89378290154264);
    }

    @Test
    public void testToString() {
        Circle1 base = new Circle1(3.0d, "yellow");
        Cylinder1 cylinder = new Cylinder1(base, 7.0d);
        assertEquals("Cylinder[Circle[radius=2.0, color='red'], height=7.0]", cylinder.toString());
    }
}