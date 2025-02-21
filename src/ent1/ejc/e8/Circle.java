package ent1.ejc.e8;

public class Circle {
    // ZONA DE ATRIBUTOS
    double radius;
    String color;


    // ZONA DE METODOS
        // Constructor
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle (){
        this.radius = 2.0d;
        this.color = "red";
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

        // Otros
    double getArea(){
        return Math.PI * radius * radius;
    }

    double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ']';
    }
}
