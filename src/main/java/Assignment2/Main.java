package Assignment2;

public class Main {
    public static void main(String[] args) {
        UIFactory singleLineFactory = new SingleLineFactory();
        System.out.println("Single Line Practice.Factory elements:\n");

        Button singleLineButton = singleLineFactory.createButton("Single Line Button");
        System.out.println(singleLineButton.display());

        TextField singleLineTextField = singleLineFactory.createTextField("Single Line Text Field");
        System.out.println(singleLineTextField.display());

        Checkbox singleLineCheckbox = singleLineFactory.createCheckbox("Single Line Checkbox");
        System.out.println(singleLineCheckbox.display());

        UIFactory doubleLineFactory = new DoubleLineFactory();
        System.out.println("\nDouble Line Practice.Factory elements:\n");

        Button doubleLineButton = doubleLineFactory.createButton("Double Line Button");
        System.out.println(doubleLineButton.display());

        TextField doubleLineTextField = doubleLineFactory.createTextField("Double Line Text Field");
        System.out.println(doubleLineTextField.display());

        Checkbox doubleLineCheckbox = doubleLineFactory.createCheckbox("Double Line Checkbox");
        System.out.println(doubleLineCheckbox.display());

        System.out.println("\nChanging the text of the elements:\n");

        singleLineButton.setElementText("New text for Single Line Button");
        System.out.println(singleLineButton.display());

        doubleLineButton.setElementText("New text for Double Line Button");
        System.out.println(doubleLineButton.display());

        doubleLineCheckbox.setElementText("New text for Double Line Checkbox");
        System.out.println(doubleLineCheckbox.display());
    }
}
