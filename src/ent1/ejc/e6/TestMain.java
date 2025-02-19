package ent1.ejc.e6;

public class TestMain {
    public static void main(String[] args) {
// Constructor test
        Animal animal = new Animal("Jacobo");
        System.out.println(animal);
        Mammal mammal = new Mammal("Pedro");
        System.out.println(mammal);
        Dog dog = new Dog("Cofee");
        System.out.println(dog);
        Cat cat = new Cat("Leia");
        System.out.println(cat);


// Otros test
        dog.greets();
        cat.greets();

    }
}
