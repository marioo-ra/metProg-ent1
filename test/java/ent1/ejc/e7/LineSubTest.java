package ent1.ejc.e7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LineSubTest {
    private LineSub line;
    private Point1 begin;
    private Point1 end;

    @BeforeEach
    void setUp() {
        begin = new Point1(1, 2);
        end = new Point1(4, 6);
        line = new LineSub(begin, end);
    }

    @Test
    void testGetBegin() {
        assertEquals(begin, line.getBegin());
    }

    @Test
    void testGetEnd() {
        assertEquals(end, line.getEnd());
    }

    @Test
    void testGetBeginX() {
        assertEquals(1, line.getBeginX());
    }

    @Test
    void testGetBeginY() {
        assertEquals(2, line.getBeginY());
    }

    @Test
    void testGetEndX() {
        assertEquals(4, line.getEndX());
    }

    @Test
    void testGetEndY() {
        assertEquals(6, line.getEndY());
    }

    @Test
    void testSetBegin() {
        line.setBegin(3, 5);
        assertEquals(3, line.getBeginX());
        assertEquals(5, line.getBeginY());
    }

    @Test
    void testSetEnd() {
        line.setEnd(7, 8);
        assertEquals(7, line.getEndX());
        assertEquals(8, line.getEndY());
    }

    @Test
    void testSetBeginX() {
        line.setBeginX(9);
        assertEquals(9, line.getBeginX());
    }

    @Test
    void testSetBeginY() {
        line.setBeginY(10);
        assertEquals(10, line.getBeginY());
    }

    @Test
    void testSetBeginXY() {
        line.setBeginXY(11, 12);
        assertEquals(11, line.getBeginX());
        assertEquals(12, line.getBeginY());
    }

    @Test
    void testSetEndX() {
        line.setEndX(13);
        assertEquals(13, line.getEndX());
    }

    @Test
    void testSetEndY() {
        line.setEndY(14);
        assertEquals(14, line.getEndY());
    }

    @Test
    void testSetEndXY() {
        line.setEndXY(15, 16);
        assertEquals(15, line.getEndX());
        assertEquals(16, line.getEndY());
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

