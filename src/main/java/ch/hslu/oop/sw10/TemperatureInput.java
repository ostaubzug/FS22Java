package ch.hslu.oop.sw10;


import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TemperatureInput {

    private static final Logger LOG = LogManager.getLogger(Temperature.class);

    public static void startInput(){
        
        String input;
        Temperature temperature;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temparatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try {
                temperature = Temperature.createFromCelsius(Float.valueOf(input));
                System.out.println(temperature.getCelsius());
            } catch (Exception e) {
                LOG.error(e.toString());
                System.out.println("Zahl konnte nicht umgewandelt werden.");
            }
            } while (!input.equals("exit"));
        System.out.println("Programm beendet");
    } 

    
}
