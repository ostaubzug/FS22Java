package ch.hslu.oop.sw12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Converter {

    public static Temperature convertToTemperature(String inpuString) {
        Float temperatureCelsius = Float.valueOf(inpuString.split(";")[2]);
        LocalDateTime timestamp = LocalDateTime.parse(
                inpuString.split(";")[1], DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\""));
        return Temperature.createFromCelsius(temperatureCelsius, timestamp);

    }

}
