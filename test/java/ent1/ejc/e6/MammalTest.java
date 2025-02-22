package ent1.ejc.e6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MammalTest {

    @Test
    public void testMammalConstructor() {
        Mammal mammal = new Mammal("Elephant");
        assertEquals("Mammal [Animal [name='Elephant']]", mammal.toString());
    }

    @Test
    public void testToString() {
        Mammal mammal = new Mammal("Tiger");
        assertEquals("Mammal [Animal [name='Tiger']]", mammal.toString());
    }
}