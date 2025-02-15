package ent1.ejc.e1;

public class Circle {
    // ZONA DE ATRIBUTOS
    private double radius = 1.0d;
    private String color = "red";


    // ZONA DE MÉTODOS
        // Constructor
    public Circle(){

    }

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

        // Getter's y setter's

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

        // Otros

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color +
                ']';
    }
}
