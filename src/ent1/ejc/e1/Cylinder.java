package ent1.ejc.e1;

public class Cylinder extends  Circle{
    // ZONA DE ATRIBUTOS
    double height;

    // ZONA DE METODOS
        // Constructor
    public Cylinder(){
        super();
        height = 1.0d;
    }

    public Cylinder (double radius){
        super(radius);
        height = 1.0d;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder (double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

        // Getter's y setter's
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }

        // Otros

    @Override
    public String toString() {
        return "Cylinder [base=" + super.toString() +
                "height=" + height +
                ']';
    }
}
