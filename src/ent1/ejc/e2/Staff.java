package ent1.ejc.e2;

public class Staff extends Person{
    // ZONA DE ATRIBUTOS
    private String school;
    private double pay;


    // ZONA DE MÉTODOS
        // Constructor
    public Staff(String name, String adress, String school, double pay){
        super(name, adress);
        this.school = school;
        this.pay = pay;
    }

        // Getter's y setter's
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAdress() {
        return super.getAdress();
    }

    @Override
    public void setAdress(String adress) {
        super.setAdress(adress);
    }

        // Otros

    @Override
    public String toString() {
        return "Staff[" + super.toString() +
                "school='" + school +
                ", pay=" + pay +
                ']';
    }
}
