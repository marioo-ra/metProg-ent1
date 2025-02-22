package ent1.ejc.e6;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    public void testDogConstructor() {
        Dog dog = new Dog("Buddy");
        assertEquals("Dog [Mammal [Animal [name='Buddy']]]", dog.toString());
    }

    @Test
    public void testGreets() {
        Dog dog = new Dog("Buddy");
        // Capturar la salida de consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        dog.greets();
        System.setOut(originalOut);
        System.out.println("salida capturada: " + outContent.toString());
        assertEquals("Woof" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testGreetsAnotherDog() {
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");
        // Capturar la salida de consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        dog1.greets(dog2);
        System.setOut(originalOut);
        System.out.println("salida capturada: " + outContent.toString());
        assertEquals("Woooof" + System.lineSeparator(), outContent.toString());
        // Restaurar la salida de consola
    }
}