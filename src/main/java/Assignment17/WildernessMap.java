package Assignment17;

import java.util.Random;

public class WildernessMap extends Map {
    public WildernessMap() {
        super();
    }

    @Override
    public Tile createTile() {
        Random random = new Random();
        int tileNum = random.nextInt(3);

        switch (tileNum) {
            case 0:
                return TileFactory.getTile("Swamp");
            case 1:
                return TileFactory.getTile("Water");
            case 2:
                return TileFactory.getTile("Forest");
            default:
                return null;
        }
    }
}