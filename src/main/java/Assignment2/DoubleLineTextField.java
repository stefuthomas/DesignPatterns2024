package Assignment2;

public class DoubleLineTextField extends TextField {
    public DoubleLineTextField(String text) {
        super(text);
    }

    public String display() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.elementText + "\n");
        stringBuilder.append("╔══════════════════════╗\n");
        stringBuilder.append("║                      ║\n");
        stringBuilder.append("╚══════════════════════╝\n");
        return stringBuilder.toString();
    }

    public void setElementText(String text) {
        this.elementText = text;
    }
}
