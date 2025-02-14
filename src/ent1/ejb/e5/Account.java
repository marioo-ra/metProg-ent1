package ent1.ejb.e5;

public class Account {
    // ZONA DE ATRIBUTOS
    private int id;
    private  Customer customer;
    private double balance = 0.0d;

    // ZONA DE METODOS
        // Constructor
    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

        // Getter's y setter's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public int getCustomerId(){
        return customer.getId();
    }

    public char getCustomerGender(){
        return customer.getGender();
    }
        // Otros
    public Account deposit(double amount){
        this.balance = balance + amount;
        return this;
    }

    public Account withdraw(double amount){
        if (balance >= amount){
            this.balance = balance - amount;
        } else{
            System.out.println ("Amount withdrawn exceeds" +
                    "the current balance!");
        }
        return this;
    }
}
