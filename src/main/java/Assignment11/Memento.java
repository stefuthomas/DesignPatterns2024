package Assignment11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;
    private LocalDateTime timestamp;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        this.timestamp = LocalDateTime.now();
        System.out.println("Memento created");
    }

    public int[] getOptions() {
        return options.clone(); // Return a copy of options array
    }

    public boolean isSelected() {
        return isSelected;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
