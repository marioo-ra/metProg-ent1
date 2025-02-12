package ent1.eja.e9;

public class Ball {
    // ZONA DE ATRIBUTOS
    private float x;
    private float y;
    private float xDelta;
    private float yDelta;
    private int radius;

    // ZONA DE METODOS
        // Constructor
    public Ball (float x, float y, int radius, float xDelta, float yDelta){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

        // Getter's y setter's
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

        // Otros
    public void move(){
        this.x = x + xDelta;
        this.y = y + yDelta;
    }

    public void reflectHorizontal(){
        this.xDelta = -1 * xDelta;
    }

    public void reflectVertical(){
        this.yDelta = -1 * yDelta;
    }

    @Override
    public String toString() {
        return "Ball [(" + x + y + ")" +
                ", speed (" + xDelta + "," + yDelta +
                ")]";
    }
}
