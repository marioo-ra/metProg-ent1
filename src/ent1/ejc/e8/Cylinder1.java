package ent1.ejc.e8;

public class Cylinder1 extends Circle1 {
    // ZONA DE ATRIBUTOS
    Circle1 base;
    double height;


    // ZONA DE METODOS
        // Constructor
    public Cylinder1(){
        this.base = new Circle1();
        this.height = 1.0d;
    }

    public Cylinder1(Circle1 base, double height){
        this.base = base;
        this.height = height;
    }

        // Getter's y setter's
    public Circle1 getBase() {
        return base;
    }

    public void setBase(Circle1 base) {
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
