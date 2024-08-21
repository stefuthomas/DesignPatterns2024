package Assignment1;

public class ForestTile implements Tile{
    private String type = "Forest";
    private String character = "F";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
