package ch.hslu.oop.sw12;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import org.junit.jupiter.api.Test;

public class csvTest {

    public csvTest() {
    }
    @Test
    public void testConstructorCelsius() {
        File file = new File("C:\\Temp\\netatmo-export-202201-202204.csv");
        assertTrue(file.exists());
    }

    
}
