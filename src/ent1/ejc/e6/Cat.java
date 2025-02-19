package ent1.ejc.e6;

public class Cat extends Mammal{
    // ZONA DE ATRIBUTOS


    // ZONA DE MÉTODOS
        // Constructor
    public Cat(String name){
        super(name);
        this.name = name;
    }

        // Otros
    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat [" + super.toString() + "]";
    }
}
