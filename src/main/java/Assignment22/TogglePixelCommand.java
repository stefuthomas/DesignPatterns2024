package Assignment22;

public class TogglePixelCommand implements Command {
    private Grid receiver;

    public TogglePixelCommand(Grid receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.togglePixel();
    }
}
