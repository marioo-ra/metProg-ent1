package ent1.ejc.e2;

public class Student extends Person{
    // ZONA DE ATRIBUTOS
    private String program;
    private int year;
    private double fee;


    // ZONA DE METODOS
        // Constructor
    public Student(String name, String adress, String program, int year, double fee){
        super(name, adress);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

        // Getter's y setter's
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
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
        return "Student[" + super.toString() +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                ']';
    }
}
