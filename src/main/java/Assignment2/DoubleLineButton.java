package Assignment2;

public class DoubleLineButton extends Button {
    public DoubleLineButton(String text) {
        super(text);
    }

    public String display() {
        StringBuilder stringBuilder = new StringBuilder();
        int borderLength = elementText.length() + 4;

       stringBuilder.append("╔");
        for (int i = 0; i < borderLength; i++) {
            stringBuilder.append("═");
        }
        stringBuilder.append("╗\n");

        stringBuilder.append("║  ").append(this.elementText).append("  ║\n");

        stringBuilder.append("╚");
        for (int i = 0; i < borderLength; i++) {
            stringBuilder.append("═");
        }
        stringBuilder.append("╝\n");

        return stringBuilder.toString();
    }

    public void setElementText(String text) {
        this.elementText = text;
    }
}
