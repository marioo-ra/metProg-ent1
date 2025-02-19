package ent1.ejc.e5;

public class Square extends Rectangle{
    // ZONA DE ATRIBUTOS


    // ZONA DE METODOS
        // Constructor
    public Square(){
        new Shape();
        this.width = 1.0d;
        this.length = 1.0d;
    }

    public Square(double side){
        new Shape();
        this.length = side;
        this.width = side;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

        // Getter's y setter's
    public double getSide(){
        return this.length;
    }

    public void setSide(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

        // Otros
    @Override
    public String toString() {
        return "Square [" + super.toString() + ']';
    }
}
