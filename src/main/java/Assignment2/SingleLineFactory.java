package Assignment2;

public class SingleLineFactory extends UIFactory {
    public SingleLineButton createButton(String text) {
        return new SingleLineButton(text);
    }

    public SingleLineCheckbox createCheckbox(String text) {
        return new SingleLineCheckbox(text);
    }

    public SingleLineTextField createTextField(String text) {
        return new SingleLineTextField(text);

    }
}
