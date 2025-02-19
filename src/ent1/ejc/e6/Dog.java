package ent1.ejc.e6;

public class Dog extends Mammal{
    // ZONA DE ATRIBUTOS

    // ZONA DE MÉTODOS
        // Constructor
    public Dog(String name){
        super(name);
        this.name = name;
    }

        // Otros
    public void greets(){
        System.out.println("Woof");
    }

    public void greets (Dog another){
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog [" + super.toString() + "]";
    }
}
