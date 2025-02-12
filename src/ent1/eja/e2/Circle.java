package ent1.eja.e2;

public class Circle {
    // ZONA DE ATRIBUTOS
    private double radius = 1.0;


    // ZONA DE METODOS
        // Constructor
    public Circle (){

    }
    public Circle(double radius){
        this.radius = radius;
    }

        // Getter's y setter's
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

        // Otros
    public double getArea (){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius = " + radius +
                "]";
    }
}
