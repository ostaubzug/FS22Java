package ch.hslu.oop.sw10;

import java.util.Scanner;
import ch.hslu.oop.sw08.*;

public class TemperatureInput {

    public static void startInput(){
        String input;
        Temperature temperature;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temparatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try {
                float value = Float.valueOf(input);
                
                
            } catch (Exception e) {
                //TODO: handle exception
            }
            
            
            } while (!input.equals("exit"));
        System.out.println("Programm beendet");
    } 

    
}
