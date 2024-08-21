package Assignment1;

import java.util.ArrayList;
import java.util.List;

public abstract class Map {
    protected ArrayList<Tile> mapMatrix = new ArrayList<>();
    public abstract Tile createTile();
    public void display() {
        //TODO: map display logic
    }
}
