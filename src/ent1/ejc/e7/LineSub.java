package ent1.ejc.e7;

public class LineSub extends Point{
    // ZONA DE ATRIBUTOS
    Point end;


    // ZONA DE METODOS
        // Constructor
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub (Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

        // Getter's y setter's
    public Point getBegin() {
        Point p = new Point(getBeginX(), getBeginY());
        return p;
    }

    public void setBegin(int x, int y){

    }

    public Point getEnd() {
        Point p = new Point(getEndX(), getEndY());
        return p;
    }

    public void setEnd(int x, int y){

    }

    public int getBeginX() {
        return getBegin().getX();
    }

    public int getBeginY() {
        return getBegin().getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        getBegin().setX(x);
    }

    public void setBeginY(int y) {
        getBegin().setY(y);
    }

    public void setBeginXY(int x, int y) {
        getBegin().setXY(x,y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x,y);
    }

    public double getLength() {
        double xDiff = end.getX() - getBeginX();
        double yDiff = end.getY() - getBeginY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xInicio = getBegin().getX();
        int yInicio = getBegin().getY();
        int xFin = end.getX();
        int yFin = end.getY();
        return Math.atan2(yFin-yInicio, xFin-xInicio);
    }
}
