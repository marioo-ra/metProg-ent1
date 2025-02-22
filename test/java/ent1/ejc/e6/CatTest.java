package ent1.ejc.e6;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    public void testCatConstructor() {
        Cat cat = new Cat("Whiskers");
        assertEquals("Cat [Mammal [Animal [name='Whiskers']]]", cat.toString());
    }

    @Test
    public void testGreets() {
        Cat cat = new Cat("Whiskers");
        // Capturar la salida de consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        cat.greets();
        System.setOut(originalOut);
        System.out.println("salida capturada: " + outContent.toString());
        assertEquals("Meow" + System.lineSeparator(), outContent.toString());
        // Restaurar la salida de consola
    }
}