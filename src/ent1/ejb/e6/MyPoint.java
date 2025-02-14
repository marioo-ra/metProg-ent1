package ent1.ejb.e6;

public class MyPoint {
    // ZONA DE ATRIBUTOS
    private int x = 0;
    private int y = 0;

    // ZONA DE METODOS
        // Constructor
    public MyPoint(){

    }

    public MyPoint(int x, int y){
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

    public int[] getXY(){
        return new int[]{x,y};
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

        // Otros

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y){
        int xDelta = this.x - x;
        int yDelta = this.y -y;
        return Math.sqrt(xDelta*xDelta + yDelta*yDelta);
    }

    public double distance (MyPoint another){
        int xDelta = this.x - another.getX();
        int yDelta = this.y - another.getY();
        return Math.sqrt(xDelta*xDelta + yDelta*yDelta);
    }

    public double distance(){
        return Math.sqrt(x*x + y*y);
    }
}

