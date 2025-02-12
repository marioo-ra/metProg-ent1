package ent1.eja.e4;

public class Employee {
    // ZONA DE ATRIBUTOS
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    // ZONA DE METODOS
        // Constructor
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

        // Getter's y setter's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

        // Otros
    public int getAnnualSalary(){
        return salary * 12;
    }

    public String getName(){
        return getFirstName() + getLastName();
    }
    public int raiseSalary(int percent){
        int newSalary = salary + salary * percent/100;
        this.salary = newSalary;
        return newSalary;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ']';
    }
}
