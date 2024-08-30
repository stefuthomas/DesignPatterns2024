package Assignment2;

public class DoubleLineFactory extends UIFactory {
    public DoubleLineButton createButton(String text) {
        return new DoubleLineButton(text);
    }

    public DoubleLineCheckbox createCheckbox(String text) {
        return new DoubleLineCheckbox(text);
    }

    public DoubleLineTextField createTextField(String text) {
        return new DoubleLineTextField(text);
    }
}
