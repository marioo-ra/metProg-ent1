package ent1.ejc.e4;

public class TestMain {
    public static void main(String[] args) {
// creas un nuevo punto de coordenadas x e y por defecto
        Point p1 = new Point();
// muestras por pantalla la información del punto
        System.out.println(p1);
// creas un nuevo punto de coordenadas x=2 e y=2
        Point p2 = new Point(2f,2f);
// muestras por pantalla la información del punto
        System.out.println(p2);
// creas un nuevo punto capaz de moverse de coordenadas x e y por defecto, con velocidades en el eje x e y por defecto también
        MovablePoint mp1 = new MovablePoint();
// muestras por pantalla la información del punto
        System.out.println(mp1);
// creas un nuevo punto capaz de moverse de coordenadas x e y por defecto, cuya velocidad en el eje "x" es 2 y en el eje "y" es 2 también
        MovablePoint mp2 = new MovablePoint(2f, 2f);
// muestras por pantalla la información del punto
        System.out.println(mp2);
// creas un nuevo punto capaz de moverse de coordenadas x=2 e y=2, cuya velocidad en el eje "x" es 2 y en el eje "y" es 2 también
        MovablePoint mp3 = new MovablePoint(2f, 2f, 2f, 2f);
// muestras por pantalla la información del punto
        System.out.println(mp3);

// le das al primer punto un nuevo valor de x e y
        p1.setXY(1f, 1f);
// muestras por pantalla la segunda coordenada del punto
        System.out.println(p1.getXY()[1]);
// le das nuevos valores de x, y velocidad en eje "x" y velocidad en eje "y" al primer punto capaz de moverse
        mp1.setX(5);
        mp1.setY(5);
        mp1.setXSpeed(2);
        mp1.setYSpeed(2);
// muestras por pantalla la segunda coordenada del punto capaz de moverse
        System.out.println(mp1.getXY()[1]);
// muestras por pantalla la velocidad en el eje "y" del punto capaz de moverse
        System.out.println(mp1.getSpeed()[1]);

    }
}
