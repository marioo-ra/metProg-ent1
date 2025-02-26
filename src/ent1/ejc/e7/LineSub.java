package ent1.ejc.e7;

public class LineSub {
    // Atributos
    private Point1 begin;
    private Point1 end;

    // Constructores
    public LineSub(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point1(beginX, beginY);
        this.end = new Point1(endX, endY);
    }

    public LineSub(Point1 begin, Point1 end) {
        this.begin = begin;
        this.end = end;
    }

    // Métodos Getter
    public Point1 getBegin() {
        return begin;
    }

    public Point1 getEnd() {
        return end;
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

    // Métodos Setter
    public void setBegin(int x, int y) {
        this.begin.setXY(x, y);
    }

    public void setEnd(int x, int y) {
        this.end.setXY(x, y);
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    // Método para calcular la longitud de la línea
    public double getLength() {
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Método para calcular el gradiente (pendiente)
    public double getGradient() {
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }
}

