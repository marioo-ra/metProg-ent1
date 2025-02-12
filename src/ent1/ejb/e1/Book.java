package ent1.ejb.e1;

public class Book {
    // ZONA DE ATRIBUTOS
    private String name;
    private Author author;
    private double price;
    int qty = 0;


    // ZONA DE METODOS
        // Constructor
    public Book (String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book (String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

        // Getter's y setter's
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

        // Otros
    @Override
    public String toString() {
        return "Book [name= " + name +
                author.toString() +
                ", price= " + price +
                ", qty= " + qty +
                "]";
    }
}
