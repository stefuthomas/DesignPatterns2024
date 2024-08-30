package Assignment2;

public abstract class Button {
    protected String elementText;

    public Button(String text) {
        this.elementText = text;
    }

    abstract void setElementText(String text);

    abstract String display();
}
