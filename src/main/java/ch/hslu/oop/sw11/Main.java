package ch.hslu.oop.sw11;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 */
public class Main {

    private static final Logger LOG = LogManager.getLogger(Temperature.class);

    public static void main(String[] args) {
        String input;
        Temperature temperature;
        TemparatureHistory history = new TemparatureHistory();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temparatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();

            if(input.equals("exit")){
                break;
            }

            try {
                temperature = Temperature.createFromCelsius(Float.valueOf(input));
                history.add(temperature);
            } catch (Exception e) {
                LOG.error(e.toString());
            }
            } while (true);
        LOG.info("Programm beendet");
        System.out.println("Anzahl Temparaturpunkte: " + history.getCount() +
                            " Durchschnittstemperatur: " + history.getAverage() +
                            " Minimal: " + history.getMinimum().getCelsius() +
                            " Maximal: " + history.getMaximum().getCelsius());              

    }
}
