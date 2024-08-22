package Assignment1;
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
                return new SwampTile();
            case 1:
                return new WaterTile();
            case 2:
                return new ForestTile();
            default:
                return null;
        }
    }
}

