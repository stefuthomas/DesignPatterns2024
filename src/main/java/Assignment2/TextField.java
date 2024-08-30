package Assignment2;

public abstract class TextField {
    protected String elementText;

    public TextField(String text) {
        this.elementText = text;
    }

    abstract String display();

    abstract void setElementText(String text);
}
