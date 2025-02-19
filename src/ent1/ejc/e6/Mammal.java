package ent1.ejc.e6;

public class Mammal extends Animal{
    // ZONA DE ATRIBUTOS

    // ZONA DE MÉTODOS
        // Constructor
    public Mammal(String name){
        super(name);
    }

        // Otros
    @Override
    public String toString() {
        return "Mammal [" + super.toString() + ']';
    }
}
