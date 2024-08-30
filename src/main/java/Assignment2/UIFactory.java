package Assignment2;

public abstract class UIFactory {
    abstract Button createButton(String text);
    abstract TextField createTextField(String text);
    abstract Checkbox createCheckbox(String text);
}
