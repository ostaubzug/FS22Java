package ch.hslu.oop.sw12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ch.hslu.oop.sw11.Temperature;
import ch.hslu.oop.sw11.TemparatureHistory;

public class StreamWriterClass {
    private static final Logger LOG = LogManager.getLogger(StreamWriterClass.class);

    public static void fileWriterInt(int input) {
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("C:\\Temp\\demo.dat"))) {
            dos.writeInt(input);
        } catch (IOException ex) {
            LOG.error("Schreibfehler", ex);
        }
    }

    public static void fileWriterFloat(Float input) {
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("C:\\Temp\\demo.dat"))) {
            dos.writeFloat(input);
        } catch (IOException ex) {
            LOG.error("Schreibfehler", ex);
        }
    }

    public static void TemperatureReader() {
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream("C:\\Temp\\demo.dat"))) {
            final int numberOfEntries = dis.readInt();
            for (int i = 0; i < numberOfEntries; i++) {
                LOG.info(dis.readFloat());
            }
        } catch (IOException ex) {
            LOG.error("Schreibfehler", ex);
        }
    }

    public static void binaryTemperature() {
        String input;
        Temperature temperature;
        TemparatureHistory history = new TemparatureHistory();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temparatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();

            if (input.equals("exit")) {
                break;
            }

            try {
                temperature = Temperature.createFromCelsius(Float.valueOf(input));
                history.add(temperature);
            } catch (Exception e) {
                LOG.error(e.toString());
            }
        } while (true);

        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("C:\\Temp\\demo.dat"))) {
            dos.writeInt(history.getCount());
            for (int i = 0; i < history.getCount(); i++) {
                dos.writeFloat(history.getItem(i).getCelsius());
            }
        } catch (IOException ex) {
            LOG.error("Schreibfehler", ex);
        }

    }

}
