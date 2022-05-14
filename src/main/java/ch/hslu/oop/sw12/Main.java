package ch.hslu.oop.sw12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Netatmo netatmo = new Netatmo();
        
        try {
            netatmo.readFileByLine();
           
        } catch (IOException io) {
            System.out.println("Error");
        }
    }

}
