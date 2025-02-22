package ent1.ejc.e2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStaffConstructor() {
        Staff staff = new Staff("John Doe", "123 Main St", "XYZ School", 50000.0);
        assertEquals("John Doe", staff.getName());
        assertEquals("123 Main St", staff.getAdress());
        assertEquals("XYZ School", staff.getSchool());
        assertEquals(50000.0, staff.getPay(), 0.001);
    }

    @Test
    public void testStaffSetSchool() {
        Staff staff = new Staff("John Doe", "123 Main St", "XYZ School", 50000.0);
        staff.setSchool("ABC School");
        assertEquals("ABC School", staff.getSchool());
    }

    @Test
    public void testStaffSetPay() {
        Staff staff = new Staff("John Doe", "123 Main St", "XYZ School", 50000.0);
        staff.setPay(60000.0);
        assertEquals(60000.0, staff.getPay(), 0.001);
    }

    @Test
    public void testStaffToString() {
        Staff staff = new Staff("John Doe", "123 Main St", "XYZ School", 50000.0);
        assertEquals("Staff[Person[name='John Doe,adress='123 Main St]school='XYZ School, pay=50000.0]", staff.toString());
    }
}
