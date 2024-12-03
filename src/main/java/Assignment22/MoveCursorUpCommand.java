package Assignment22;

public class MoveCursorUpCommand implements Command {
    private Grid receiver;

    public MoveCursorUpCommand(Grid receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.moveUp();
    }
}