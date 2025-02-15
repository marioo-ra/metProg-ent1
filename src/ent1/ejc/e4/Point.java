package ent1.ejc.e4;

public class Point {
    // ZONA DE ATRIBUTOS
    private float x;
    private float y;


    // ZONA DE MÉTODOS
        // Constructor
    public Point(){
        x = 0.0f;
        y = 0.0f;
    }

    public Point (float x, float y){
        this.x = x;
        this.y = y;
    }

        // Getter's y setter's
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

        // Otros
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
