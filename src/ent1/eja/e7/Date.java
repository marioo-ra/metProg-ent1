package ent1.eja.e7;

public class Date {
    // ZONA DE ATRIBUTOS
    private int day;
    private int month;
    private int year;


    // ZONA DE METODOS
        // Constructor
    public Date (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

        // Getter's y setter's
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

        // Otro¡¡'0'¡''´-
    @Override
    public String toString() {
        return String.format("%02d/%02d/%02d", day, month, year);
    }
}
