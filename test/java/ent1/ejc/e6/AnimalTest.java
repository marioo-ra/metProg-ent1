package ent1.ejc.e6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    public void testAnimalConstructor() {
        Animal animal = new Animal("Lion");
        assertEquals("Lion", animal.toString().split("'")[1]);
    }

    @Test
    public void testToString() {
        Animal animal = new Animal("Elephant");
        assertEquals("Animal [name='Elephant']", animal.toString());
    }
}