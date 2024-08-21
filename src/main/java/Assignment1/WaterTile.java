package Assignment1;

public class WaterTile implements Tile{
    private String type = "Water";
    private String character = "W";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
