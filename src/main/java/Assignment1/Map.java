package Assignment1;
import java.util.ArrayList;
import java.util.List;

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
    public abstract Tile createTile();
}
