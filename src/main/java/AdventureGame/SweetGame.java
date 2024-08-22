package AdventureGame;

public class SweetGame extends Game {
    @Override
    public Room createRoom() {
        return new LovelyRoom();
    }
}
