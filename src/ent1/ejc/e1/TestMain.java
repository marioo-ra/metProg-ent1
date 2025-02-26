package ent1.ejc.e1;

public class TestMain {
    public static void main(String[] args) {
// se crea un cilindro con color, radio y altura por defecto
        Cylinder c1 = new Cylinder();
// muestras por pantalla la información del cilindro, incluido el área de su base y el volumen del cilindro
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

// crea un nuevo cilindro de radio 10, color y altura por defecto
        Cylinder c2 = new Cylinder(10.0);
// muestras por pantalla la información del cilindro, incluido el área de su base y el volumen del cilindro
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
// crea un nuevo cilindro de altura 10, radio 2 y color por defecto
        Cylinder c3 = new Cylinder(2.0, 10.0);
// muestras por pantalla la información del cilindro, incluido el área de su base y el volumen del cilindro
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
// muestra por pantalla que forma tiene la base, el radio, color y altura del cilindro
        System.out.println(c3);
    }
}
