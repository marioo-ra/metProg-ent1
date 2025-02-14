package ent1.ejb.e5;

public class Customer {
    // ZONA DE ATRIBUTOS
    private int id;
    private String name;
    private char gender;


    // ZONA DE METODOS
        // Constructor
    public Customer (int id, String name, char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

        // Getter's y setter's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

        // Otros
    @Override
    public String toString() {
        return name +
                "(" + id +
                ')';
    }
}
