package Assignment17;

import java.util.Random;

public class CityMap extends Map {
    public CityMap() {
        super();
    }
    @Override
    public Tile createTile() {
        Random random = new Random();
        int tileNum = random.nextInt(3);

        switch (tileNum) {
            case 0:
                return TileFactory.getTile("Road");
            case 1:
                return TileFactory.getTile("Forest");
            case 2:
                return TileFactory.getTile("Building");
            default:
                return null;
        }
    }
}
