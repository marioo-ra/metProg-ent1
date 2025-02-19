package ent1.ejc.e5;

import java.security.KeyStore;

public class Shape {
    // ZONA DE ATRIBUTOS
    String color;
    boolean filled;

    // ZONA DE METODOS
        // Constructor
    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    public Shape (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

        // Getter's y setter's
    public String getColor() {
        return color;

    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

        // Otros

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
