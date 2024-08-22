package Assignment1;
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
                return new RoadTile();
            case 1:
                return new ForestTile();
            case 2:
                return new BuildingTile();
            default:
                return null;
        }
    }
}
