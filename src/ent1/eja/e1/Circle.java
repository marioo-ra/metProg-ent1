package ent1.eja.e1;

public class Circle {
    // ZONA DE ATRIBUTOS
    private double radius = 1.0d;
    private String color = "red";


    // ZONA DE METODOS
        // Constructor
    public Circle(){
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }

        //Getter's y Setter's
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

        // Otros
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius = " + radius +
                ", color = " + color +
                "]";
    }
}
