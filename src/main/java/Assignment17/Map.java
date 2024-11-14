package Assignment17;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class Map {
    private final Tile[][] tiles;

    public Map() {
        tiles = new Tile[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tiles[i][j] = createTile();
            }
        }
    }
    public void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
        }
    }
    public GridPane draw() {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Rectangle rect = new Rectangle(50, 50);
                rect.setFill(Color.valueOf(TileFactory.getColor(tiles[i][j].getType())));
                gridPane.add(rect, j, i);
            }
        }
        return gridPane;
    }
    public abstract Tile createTile();

    public Tile[][] getTiles() {
        return tiles;
    }
}
