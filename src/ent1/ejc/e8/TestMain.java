package ent1.ejc.e8;

public class TestMain {
    public static void main(String[] args) {
// crea un círculo de radio y color por defecto
        Circle1 circle = new Circle1();
// muestras por pantalla la información del círculo
        System.out.println(circle);
// creas un cilindro cuya base tiene los datos del círculo anterior y le da una altura por defecto
        Cylinder1 cylinder = new Cylinder1();
// muestras por pantalla la información del cilindro
        System.out.println(cylinder);

// muestra por pantalla el área y perímetro del círculo
        System.out.println("area is: " + circle.getArea());
        System.out.println("perimeter is: " + circle.getPerimeter());
// muestra por pantalla el volumen del cilindro
        System.out.println("volume is: " + cylinder.getVolume());

    }
}
