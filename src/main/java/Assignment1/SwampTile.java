package Assignment1;

public class SwampTile implements Tile{
    private String type = "Swamp";
    private String character = "S";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
