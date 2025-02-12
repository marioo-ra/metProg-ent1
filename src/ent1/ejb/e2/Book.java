package ent1.ejb.e2;

public class Book {
    // ZONA DE ATRIBUTOS
    private String name;
    private Author[] authors;
    private double price;
    int qty = 0;


    // ZONA DE METODOS
        // Constructor
    public Book (String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book (String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
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

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
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

    public String getAuthorsName(){
        return authors.toString();
    }

        // Otros
    @Override
    public String toString() {
        return "Book [name= " + name +
                ", authors= " + authors.toString() +
                ", price= " + price +
                ", qty= " + qty +
                "]";
    }
}
