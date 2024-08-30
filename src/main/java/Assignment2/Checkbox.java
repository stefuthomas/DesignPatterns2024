package Assignment2;

public abstract class Checkbox {
    protected String elementText;

    public Checkbox(String text) {
        this.elementText = text;
    }

    abstract String display();

    abstract void setElementText(String text);
}
