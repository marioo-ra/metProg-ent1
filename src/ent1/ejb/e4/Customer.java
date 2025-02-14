package ent1.ejb.e4;

public class Customer {
    // ZONA DE ATRIBUTOS
    private int id;
    private String name;
    private int discount;

    // ZONA DE METODOS
        // Constructor
    public Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

        // Otros

    @Override
    public String toString() {
        return name + "(" + id + ")" +
                "(" + discount + "%)";
    }
}

