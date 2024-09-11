package Assignment6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class FilePrinter extends PrinterDecorator {
    private BufferedWriter writer;
    public FilePrinter(Printer printer) {
        super(printer);
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void print(String message) {
        try {
            super.print(message);
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
