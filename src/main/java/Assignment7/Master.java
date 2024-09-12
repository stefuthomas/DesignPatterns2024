package Assignment7;

public class Master extends State {
    public Master(Character character) {
        super(character);
    }

    @Override
    void action() {
        getCharacter().setGameOver(true);    }
}