package ent1.ejc.e5;

public class Circle extends Shape{
    // ZONA DE ATRIBUTOS
    double radius;


    // ZONA DE METODOS
        // Constructor
    public Circle(){
        new Shape();
        this.radius = 1.0d;
    }

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

        // Getter's y setter's

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

        // Otros

    @Override
    public String toString() {
        return "Circle [" + super.toString() +
                ", radius=" + radius +
                ']';
    }
}
