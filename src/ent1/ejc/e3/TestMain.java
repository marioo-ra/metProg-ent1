package ent1.ejc.e3;

public class TestMain {
    public static void main(String[] args) {
// crea un punto en 2 dimensiones con valores de "x" e "y" por defecto
        Point2D p1 = new Point2D();
// muestra por pantalla la información del punto
        System.out.println(p1);
// crea un punto en 2 dimensiones con x=5 e y=5
        Point2D p2 = new Point2D(5f,5f);
// muestra por pantalla la información del punto
        System.out.println(p2);
// crea un punto en 3 dimensiones con valores de "x", "y", "z" por defecto
        Point3D p3 = new Point3D();
// muestra por pantalla la información del punto
        System.out.println(p3);
// crea un punto en 3 dimensiones con x=1, y=1, z=1
        Point3D p4 = new Point3D(1f,1f,1f);
// muestra por pantalla la información del punto
        System.out.println(p4);

// muestra por pantalla cada coordenada del cuarto punto
        System.out.println("x is: " + p4.getX());
        System.out.println("y is: " + p4.getY());
        System.out.println("z is: " + p4.getZ());
// muestra por pantalla la segunda coordenada del tercer punto
        System.out.println("point y is: " + p3.getXY()[1]);
// muestra por pantalla la tercera coordenada del cuarto punto
        System.out.println("point z is: " + p4.getXYZ()[2]);
// da nuevos valores a las coordenadas e imprime la información del punto
        p4.setXYZ(2,3,2);
        System.out.println(p3);
    }
}
