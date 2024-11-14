package Assignment17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Game extends Application {
    private static final int MAP_CHOICE = 1;

    @Override
    public void start(Stage primaryStage) {
        Map map = createMap(MAP_CHOICE);
        map.display();
        GridPane gridPane = map.draw();

        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Map createMap(int mapChoice) {
        if (mapChoice == 1) {
            return new CityMap();
        } else if (mapChoice == 2) {
            return new WildernessMap();
        } else {
            return null;
        }
    }
}