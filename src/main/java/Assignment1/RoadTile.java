package Assignment1;

public class RoadTile implements Tile{
    private String type = "Road";
    private String character = "R";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
