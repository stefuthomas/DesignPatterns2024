package Assignment5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger logger;
    private String fileName;
    private BufferedWriter writer;

    private Logger() {
        this.fileName = "logger.txt";
        open();
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();

        }
        return logger;
    }

    public void write(String text) {
        try {
            writer.write(text);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error occurred. Message: " + e.getMessage());
        }
    }

    public void setFileName(String fileName) {
        close();
        this.fileName = fileName;
        open();
    }

    public void open() {
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            System.out.println("Error occured. Message:" + e.getMessage());
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("Error occured. Message:" + e.getMessage());
        }
    }
}
