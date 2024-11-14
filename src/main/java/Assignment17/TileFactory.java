package Assignment17;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {
    private static final Map<String, Tile> tileMap = new HashMap<>();

    public static Tile getTile(String type) {
        Tile tile = tileMap.get(type);
        if (tile == null) {
            switch (type) {
                case "Swamp":
                    tile = new SwampTile();
                    break;
                case "Water":
                    tile = new WaterTile();
                    break;
                case "Forest":
                    tile = new ForestTile();
                    break;
                case "Road":
                    tile = new RoadTile();
                    break;
                case "Building":
                    tile = new BuildingTile();
                    break;
            }
            tileMap.put(type, tile);
        }
        return tile;
    }

    public static String getColor(String type) {
        switch (type) {
            case "Swamp":
                return "GREEN";
            case "Water":
                return "BLUE";
            case "Forest":
                return "DARKGREEN";
            case "Road":
                return "GREY";
            case "Building":
                return "BROWN";
            default:
                return "WHITE";
        }

    }
}