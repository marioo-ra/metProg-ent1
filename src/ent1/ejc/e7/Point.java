package ent1.ejc.e7;

public class Point {
    // ZONA DE ATIBUTOS
    private int x;
    private int y;


    // ZONA DE METODOS
        // Constructor
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

        // Getter's y setter's
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

        // Otros
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
