package ent1.ejc.e7;

public class Line {
    // ZONA DE ATRIBUTOS
    private Point1 begin;

    private Point1 end;


    // ZONA DE METODOS
        // Constructor
    public Line (Point1 begin, Point1 end) { // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }

    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point1(beginX, beginY);
        end = new Point1(endX, endY);
    }

        // Getter's y setter's
    public Point1 getBegin() {
        return begin;
    }

    public void setBegin(Point1 begin) {
        this.begin = begin;
    }

    public Point1 getEnd() {
        return end;
    }

    public void setEnd(Point1 end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        this.begin = new Point1(x, getBeginY());
    }

    public void setBeginY(int y) {
        this.begin = new Point1(getBeginX(), y);
    }

    public void setBeginXY(int x, int y) {
        this.begin = new Point1(x, y);
    }

    public void setEndX(int x) {
        this.end = new Point1(x, getBeginY());
    }

    public void setEndY(int y) {
        this.end = new Point1(getBeginX(), y);
    }

    public void setEndXY(int x, int y) {
        this.end = new Point1(x,y);
    }

    public double getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

        // Otros
    @Override
    public String toString() {
        return "Line [begin=" + begin + ", end=" + end + "]";
    }
}
