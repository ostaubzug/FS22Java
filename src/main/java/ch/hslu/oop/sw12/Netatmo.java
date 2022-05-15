package ch.hslu.oop.sw12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Netatmo {
    private static final Logger LOG = LogManager.getLogger(StreamWriterClass.class);
    private File csvFile = new File("C:\\Temp\\netatmo-export-202201-202204.csv");
    TemparatureHistory temparatureHistory = new TemparatureHistory();

    public void readFileByLine() {
        if (csvFile.exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(csvFile), Charset.forName("UTF-8")))) {
                String line;
                while ((line = br.readLine()) != null) {
                    temparatureHistory.add(Converter.convertToTemperature(line));
                }
            } catch (IOException io) {
                LOG.error(io.getMessage(), io);
            }
        }

    }

    public void LogResults() {
        LOG.info("Average Temp:"+ temparatureHistory.getAverage());
        LOG.info("MaximalTemperatur"+ temparatureHistory.getMaximum().getCelsius()+
                "erreicht am: "+ temparatureHistory.getMaximum().getTimestamp());
        LOG.info("MinimalTemperatur"+ temparatureHistory.getMinimum().getCelsius()+
                "erreicht am: "+ temparatureHistory.getMinimum().getTimestamp());

    }
}
