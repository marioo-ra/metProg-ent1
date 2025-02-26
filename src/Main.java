
import ent1.eja.e2.Circle;
import ent1.ejc.e1.Cylinder;
import ent1.ejc.e3.Point2D;
import ent1.ejc.e3.Point3D;
import ent1.ejc.e4.MovablePoint;
import ent1.ejc.e4.Point;
import ent1.ejc.e5.Rectangle;
import ent1.ejc.e5.Shape;
import ent1.ejc.e5.Square;
import ent1.ejc.e6.Animal;
import ent1.ejc.e6.Cat;
import ent1.ejc.e6.Dog;
import ent1.ejc.e6.Mammal;
import ent1.ejc.e7.Line;
import ent1.ejc.e7.Point1;
import ent1.ejc.e8.Circle1;
import ent1.ejc.e8.Cylinder1;

class Main {
    public static void main(String[] args){
        ent1_eja_e2();
    }
    static public void ent1_eja_e1(){
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
    static public void ent1_eja_e2(){
// creas un nuevo círculo de radio 1.1
        Circle c1 = new Circle(1.1);
// muestras por pantalla la información del círculo
        System.out.println(c1);
// creas un nuevo círculo de radio por defecto
        Circle c2 = new Circle();
// muestras por pantalla la información del nuevo círculo
        System.out.println(c2);

// le das un nuevo valor al radio del primer círculo
        c1.setRadius(2.2);
// muestras por pantalla la información del círculo con el nuevo radio
        System.out.println(c1);
// muestras por pantalla el radio
        System.out.println("radius is: " + c1.getRadius());

// obtienes el área y la circunferencia y lo muestras por pantalla
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
    static public void ent1_eja_e3(){
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
    static public void ent1_eja_e4(){
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
    static public void ent1_eja_e5(){
// creas una figura de color azul que no esté rellena
        Shape shape = new Shape("blue", false);
// muestras por pantalla la información de la figura
        System.out.println(shape);
// creas un círculo de radio 3
        ent1.ejc.e5.Circle circle = new ent1.ejc.e5.Circle(3);
// muestras por pantalla la información de la figura
        System.out.println(circle);
// creas un rectángulo de anchura 4 y altura 6
        Rectangle rectangle = new Rectangle(4,6);
// muestras por pantalla la información de la figura
        System.out.println(rectangle);
// creas un cuadrado de lado 3
        Square square = new Square(3);
// muestras por pantalla la información de la figura
        System.out.println(square);

// muestra por pantalla el color de la figura
        System.out.println("color is: " + shape.getColor());
// imprime verdadero si la figura está rellena o falso si no lo está
        System.out.println(circle.isFilled());
// muestra por pantalla el radio del círculo
        System.out.println("radius is: " + circle.getRadius());
// muestra por pantalla el área, perímetro, anchura y altura del rectángulo
        System.out.println("area is: " + rectangle.getArea());
        System.out.println("perimeter is: " + rectangle.getPerimeter());
        System.out.println("width is: " + rectangle.getWidth());
        System.out.println("length is: " + rectangle.getLength());
//  muestra por pantalla el lado, área y color del cuadrado
        System.out.println("side is: " + square.getSide());
        System.out.println(square.getArea());
        System.out.println(square.getColor());
    }
    static public void ent1_eja_e6(){
// crea un animal cualquiera y le da el nombre de Jacobo
        Animal animal = new Animal("Jacobo");
// muestra por pantalla el nombre del animal
        System.out.println(animal);
// crea un mamífero y le da el nombre de Pedro
        Mammal mammal = new Mammal("Pedro");
// muestra por pantalla el nombre del mamífero
        System.out.println(mammal);
// crea un perro y le da el nombre de Cofee
        Dog dog = new Dog("Cofee");
// muestra por pantalla el nombre del perro
        System.out.println(dog);
// crea un gato y le da el nombre de Leia
        Cat cat = new Cat("Leia");
// muestra por pantalla el nombre del gato
        System.out.println(cat);


// ladra en forma de agradecimiento
        dog.greets();
// maúlla en forma de agradecimiento
        cat.greets();

    }
    static public void ent1_eja_e7(){
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
    static public void ent1_eja_e8(){
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