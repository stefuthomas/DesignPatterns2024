package Assignment19;

public class User implements IUser {
    private String name;
    private UserController controller;

    public User(String name) {
        this.name = name;
    }

    public void setController(UserController controller) {
        this.controller = controller;
    }

    @Override
    public void send(String message, String senderUsername, String receiverUsername) {
        controller.send(message, senderUsername, receiverUsername);
    }

    @Override
    public void receive(String message, String username) {
        controller.receive(message, username);
    }

    public String getName() {
        return name;
    }
}