package Assignment11;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;

import java.time.format.DateTimeFormatter;

public class Gui extends Application {

    // create a GUI with three adjacent ColorBoxes and one CheckBox below them
    private Controller controller;
    private ColorBox colorBox1;
    private ColorBox colorBox2;
    private ColorBox colorBox3;
    private CheckBox checkBox;
    private Stage stage2;

    public void start(Stage stage) {

        controller = new Controller(this);

        // Insets for margin and padding
        Insets insets = new Insets(10, 10, 10, 10);

        // Create three ColorBoxes
        colorBox1 = new ColorBox(1, controller);
        colorBox2 = new ColorBox(2, controller);
        colorBox3 = new ColorBox(3, controller);

        // Create a CheckBox
        checkBox = new CheckBox("Click me!");
        checkBox.setPadding(insets);

        // Add the ColorBoxes and CheckBox to a HBox
        HBox hBox = new HBox(colorBox1.getRectangle(), colorBox2.getRectangle(), colorBox3.getRectangle());
        hBox.setSpacing(10);

        hBox.setMargin(colorBox1.getRectangle(), insets);
        hBox.setMargin(colorBox2.getRectangle(), insets);
        hBox.setMargin(colorBox3.getRectangle(), insets);


        Label label = new Label("Press Ctrl-Z to undo the last change.");
        label.setPadding(insets);

        // create a Button to display the history
        Button button = new Button("History");
        // add the Button to an HBox
        HBox buttonBox = new HBox(button);
        buttonBox.setPadding(insets);
        //add functionality to the Button
        button.setOnAction(event -> {
            historyView();
        });
        // create a VBox that contains the HBox and the CheckBox
        VBox vBox = new VBox(hBox, checkBox, label, buttonBox);
        // call controller when the CheckBox is clicked
        checkBox.setOnAction(event -> {
            controller.setIsSelected(checkBox.isSelected());
        });

        // Set the HBox to be the root of the Scene
        Scene scene = new Scene(vBox);
        scene.setOnKeyPressed(event -> {
            if (event.isControlDown() && event.getCode() == KeyCode.Z) {
                // Ctrl-Z: undo
                System.out.println("Undo key combination pressed");
                controller.undo();
            }
            if (event.isControlDown() && event.getCode() == KeyCode.Y) {
                // Ctrl-Y: redo
                System.out.println("Redo key combination pressed");
                controller.redo();
            }
        });

        stage.setScene(scene);
        stage.setTitle("Memento Pattern Example");
        stage.show();
    }

    public void updateGui() {
        // called after restoring state from a Memento
        colorBox1.setColor(controller.getOption(1));
        colorBox2.setColor(controller.getOption(2));
        colorBox3.setColor(controller.getOption(3));
        checkBox.setSelected(controller.getIsSelected());
    }

    public void historyView() {
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10, 10, 10, 40));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        if (!controller.getHistory().isEmpty()) {
            controller.getHistory().forEach(memento -> {
                HBox hBox = new HBox();
                hBox.setSpacing(40);
                String formattedTimestamp = memento.getTimestamp().format(formatter);
                Label label = new Label(formattedTimestamp);
                Button button = new Button("Restore");
                button.setOnAction(event -> {
                    controller.restoreState(memento);
                    updateGui();
                });
                hBox.getChildren().addAll(label, button);
                vBox.getChildren().add(hBox);
            });
        } else {
            Label label = new Label("No history");
            vBox.getChildren().add(label);
        }

        Scene scene2 = new Scene(vBox);
        stage2 = new Stage();
        stage2.setScene(scene2);
        stage2.setTitle("History");

        // Set minimal height and width
        stage2.setMinHeight(300);
        stage2.setMinWidth(400);

        stage2.show();
    }
}