package ent1.ejc.e5;

public class Rectangle extends Shape {
    // ZONA DE ATRIBUTOS
    double width;
    double length;


    // ZONA DE METODOS
    // Constructor
    public Rectangle() {
        this.width = 1.0d;
        this.length = 1.0d;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

        // Getter's y setter's
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2*width + 2*length;
    }

        // Otros
    @Override
    public String toString() {
        return "Rectangle [" + super.toString() +
                ", width=" + width +
                ", length=" + length +
                ']';
    }
}