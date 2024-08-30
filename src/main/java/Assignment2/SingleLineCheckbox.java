package Assignment2;

public class SingleLineCheckbox extends Checkbox {
    public SingleLineCheckbox(String text) {
        super(text);
    }

    public String display() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("┌───┐\n");
        stringBuilder.append("│ x │" + this.elementText + "\n");
        stringBuilder.append("└───┘\n");
        return stringBuilder.toString();
    }

    public void setElementText(String text) {
        this.elementText = text;
    }
}
