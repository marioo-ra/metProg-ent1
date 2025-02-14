package ent1.ejb.e4;

public class Invoice {
    // ZONA DE ATRIBUTOS
    private int id;
    private Customer customer;
    private double amount;

    // ZONA DE METODOS
        // Constructor
    public Invoice (int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount - amount * (getCustomerDiscount() / 100d);
    }

        // Otros
    @Override
    public String toString() {
        return "Invoice [" +
                "id=" + id +
                customer.toString() +
                ", amount=" + amount +
                ']';
    }
}
