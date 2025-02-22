package ent1.ejc.e2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPersonConstructor() {
        Person person = new Person("John Doe", "123 Main St");
        assertEquals("John Doe", person.getName());
        assertEquals("123 Main St", person.getAdress());
    }

    @Test
    public void testPersonSetName() {
        Person person = new Person("John Doe", "123 Main St");
        person.setName("Jane Doe");
        assertEquals("Jane Doe", person.getName());
    }

    @Test
    public void testPersonSetAdress() {
        Person person = new Person("John Doe", "123 Main St");
        person.setAdress("456 Oak St");
        assertEquals("456 Oak St", person.getAdress());
    }

    @Test
    public void testPersonToString() {
        Person person = new Person("John Doe", "123 Main St");
        assertEquals("Person[name='John Doe,adress='123 Main St]", person.toString());
    }
}