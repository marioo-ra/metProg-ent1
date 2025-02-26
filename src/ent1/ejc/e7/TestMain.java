package ent1.ejc.e7;

public class TestMain {
    public static void main(String[] args) {
// Prueba del constructor de la clase Point
        Point1 p1 = new Point1(10, 20);
// Imprime el punto (10,20)
        System.out.println(p1);

// Prueba del constructor de la clase Line con coordenadas
        Line l1 = new Line(0, 0, 3, 4);
// Imprime la línea con los puntos (0,0) y (3,4)
        System.out.println(l1);

// Prueba del constructor de la clase Line con objetos Point
        Point1 begin = new Point1(2, 2);
        Point1 end = new Point1(5, 5);
        Line l2 = new Line(begin, end);
// Imprime la línea con los puntos (2,2) y (5,5)
        System.out.println(l2);

// Prueba de los métodos setters y getters de Point
// Modifica las coordenadas del punto p1
        p1.setXY(100, 10);
// Imprime el punto actualizado (100,10)
        System.out.println(p1);
    }
}
