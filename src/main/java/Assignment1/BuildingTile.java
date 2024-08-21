package Assignment1;

public class BuildingTile implements Tile{
    private String type = "Building";
    private String character = "B";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
