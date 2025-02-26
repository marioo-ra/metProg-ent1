package ent1.ejc.e7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LineTest {

    @Test
    public void testLineConstructorWithPoints() {
        Point1 begin = new Point1(1, 2);
        Point1 end = new Point1(3, 4);
        Line line = new Line(begin, end);
        assertEquals(begin, line.getBegin());
        assertEquals(end, line.getEnd());
    }

    @Test
    public void testLineConstructorWithCoordinates() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals(1, line.getBeginX());
        assertEquals(2, line.getBeginY());
        assertEquals(3, line.getEndX());
        assertEquals(4, line.getEndY());
    }

    @Test
    public void testSetBegin() {
        Line line = new Line(1, 2, 3, 4);
        Point1 newBegin = new Point1(5, 6);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    public void testSetEnd() {
        Line line = new Line(1, 2, 3, 4);
        Point1 newEnd = new Point1(7, 8);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    public void testSetBeginXY() {
        Line line = new Line(1, 2, 3, 4);
        line.setBeginXY(5, 6);
        assertEquals(5, line.getBeginX());
        assertEquals(6, line.getBeginY());
    }

    @Test
    public void testSetEndXY() {
        Line line = new Line(1, 2, 3, 4);
        line.setEndXY(7, 8);
        assertEquals(7, line.getEndX());
        assertEquals(8, line.getEndY());
    }

    @Test
    public void testGetLength() {
        Line line = new Line(0, 0, 3, 4);
        assertEquals(5.0, line.getLength(), 0.001);
    }

    @Test
    public void testGetGradient() {
        Line line = new Line(0, 0, 1, 1);
        assertEquals(Math.PI / 4, line.getGradient(), 0.001);
    }

    @Test
    public void testToString() {
        Line line = new Line(1, 2, 3, 4);
        assertEquals("Line [begin=(1,2), end=(3,4)]", line.toString());
    }
}