package ent1.ejc.e7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LineSubTest {
    private LineSub line;
    private Point begin;
    private Point end;

    @BeforeEach
    void setUp() {
        begin = new Point(1, 2);
        end = new Point(4, 6);
        line = new LineSub(begin, end);
    }

    @Test
    void testGetBegin() {
        assertNotNull(line.getBegin());
        assertEquals(1, line.getBegin().getX());
        assertEquals(2, line.getBegin().getY());
    }

    @Test
    void testGetEnd() {
        assertNotNull(line.getEnd());
        assertEquals(4, line.getEnd().getX());
        assertEquals(6, line.getEnd().getY());
    }

    @Test
    void testSetEndXY() {
        line.setEndXY(7, 8);
        assertEquals(7, line.getEnd().getX());
        assertEquals(8, line.getEnd().getY());
    }

    @Test
    void testGetLength() {
        double expectedLength = Math.sqrt(Math.pow(4 - 1, 2) + Math.pow(6 - 2, 2));
        assertEquals(expectedLength, line.getLength(), 0.0001);
    }

    @Test
    void testGetGradient() {
        double expectedGradient = Math.atan2(6 - 2, 4 - 1);
        assertEquals(expectedGradient, line.getGradient(), 0.0001);
    }
}
