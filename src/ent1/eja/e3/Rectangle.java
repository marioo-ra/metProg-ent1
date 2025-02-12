package ent1.eja.e3;

public class Rectangle {
    // ZONA DE ATRIBUTOS
    private float length = 1.0f;
    private float width = 1.0f;

    // ZONA DE METODOS
        // Constructor
    public Rectangle(){}

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

        // Getter's y setter's
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

        // Otros
    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2*length) + (2*width);
    }

    @Override
    public String toString() {
        return "Rectangle [lenght = " + length +
                ", widht = " + width +
                "]";
    }
}
