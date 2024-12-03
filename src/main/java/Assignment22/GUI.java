// src/main/java/Assignment22/GUI.java
package Assignment22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {
    private Grid grid = new Grid();
    private MoveCursorUpCommand moveCursorUpCommand;
    private MoveCursorDownCommand moveCursorDownCommand;
    private MoveCursorLeftCommand moveCursorLeftCommand;
    private MoveCursorRightCommand moveCursorRightCommand;
    private TogglePixelCommand togglePixelCommand;
    private GenerateCodeCommand generateCodeCommand;


    @Override
    public void start(Stage primaryStage) {
        moveCursorUpCommand = new MoveCursorUpCommand(grid);
        moveCursorDownCommand = new MoveCursorDownCommand(grid);
        moveCursorLeftCommand = new MoveCursorLeftCommand(grid);
        moveCursorRightCommand = new MoveCursorRightCommand(grid);
        togglePixelCommand = new TogglePixelCommand(grid);
        generateCodeCommand = new GenerateCodeCommand(grid);

        VBox root = new VBox();
        Button createCodeButton = new Button("Create\nCode");
        createCodeButton.setFocusTraversable(false);
        root.getChildren().addAll(createCodeButton, grid);

        Scene scene = new Scene(root);
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.UP) {
                moveCursorUpCommand.execute();
            } else if (event.getCode() == KeyCode.DOWN) {
                moveCursorDownCommand.execute();
            } else if (event.getCode() == KeyCode.LEFT) {
                moveCursorLeftCommand.execute();
            } else if (event.getCode() == KeyCode.RIGHT) {
                moveCursorRightCommand.execute();
            } else if (event.getCode() == KeyCode.SPACE) {
                togglePixelCommand.execute();
            }
        });

        createCodeButton.setOnAction(event -> {
            generateCodeCommand.execute();
            grid.requestFocus();
        });

        primaryStage.setTitle("Assignment 22");
        primaryStage.setScene(scene);
        primaryStage.show();
        grid.requestFocus();
    }
}