package ent1.ejc.e6;

public class Animal {
    // ZONA DE ATRIBUTOS
    String name;


    // ZONA DE MÉTODOS
        // Constructor
    public Animal(String name){
        this.name = name;
    }

        // Otros
    @Override
    public String toString() {
        return "Animal [" +
                "name='" + name + '\'' +
                ']';
    }
}
