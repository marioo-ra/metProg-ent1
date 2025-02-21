package ent1.ejc.e8;

public class Cylinder extends Circle{
    // ZONA DE ATRIBUTOS
    Circle base;
    double height;


    // ZONA DE METODOS
        // Constructor
    public Cylinder(){
        this.base = new Circle();
        this.height = 1.0d;
    }

    public Cylinder(Circle base, double height){
        this.base = base;
        this.height = height;
    }

        // Getter's y setter's
    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

        // Otros
    public double getVolume(){
        return base.getArea() * height;
    }

    @Override
    public double getArea(){
        return base.getPerimeter() * (radius * height);
    }

    @Override
    public String toString() {
        return "Cylinder[" +
                super.toString() +
                ", height=" + height +
                ']';
    }
}
