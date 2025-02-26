package ent1.ejc.e6;

public class TestMain {
    public static void main(String[] args) {
// crea un animal cualquiera y le da el nombre de Jacobo
        Animal animal = new Animal("Jacobo");
// muestra por pantalla el nombre del animal
        System.out.println(animal);
// crea un mamífero y le da el nombre de Pedro
        Mammal mammal = new Mammal("Pedro");
// muestra por pantalla el nombre del mamífero
        System.out.println(mammal);
// crea un perro y le da el nombre de Cofee
        Dog dog = new Dog("Cofee");
// muestra por pantalla el nombre del perro
        System.out.println(dog);
// crea un gato y le da el nombre de Leia
        Cat cat = new Cat("Leia");
// muestra por pantalla el nombre del gato
        System.out.println(cat);


// ladra en forma de agradecimiento
        dog.greets();
// maúlla en forma de agradecimiento
        cat.greets();

    }
}
