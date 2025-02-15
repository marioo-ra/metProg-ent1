package ent1.ejc.e2;

public class Person {
    // ZONA DE ATRIBUTOS
    private String name;
    private String adress;


    // ZONA DE METODOS
        // Constructor
    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

        // Getter's y setter's
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

        // Otros

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name +
                ",adress='" + adress +
                ']';
    }
}
