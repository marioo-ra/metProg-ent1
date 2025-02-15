package ent1.ejc.e4;

public class MovablePoint extends Point{
    // ZONA DE ATRIBUTOS
    private float xSpeed;
    private float ySpeed;


    // ZONA DE METODOS
        // Constructor
    public MovablePoint(){
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public MovablePoint (float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        new Point(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

        // Getter's y setter's

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public float getX() {
        return super.getX();
    }

    @Override
    public void setX(float x) {
        super.setX(x);
    }

    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

        // Otros

    @Override
    public String toString() {
        return super.toString() +
                ", speed=(" + xSpeed +
                "," + ySpeed +
                ")";
    }
}
