package Assignment19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mediator {
    private static Mediator instance;
    private List<UserController> users = new ArrayList<>();

    private Mediator() {}

    public static Mediator getInstance() {
        if (instance == null) {
            instance = new Mediator();
        }
        return instance;
    }

    public void addUserController(UserController controller) {
        users.add(controller);
    }

    public void send(String message, String senderUsername, String receiverUsername) {
        for (UserController controller : users) {
            User user = controller.getUser();
            if (user != null && user.getName().equals(receiverUsername)) {
                controller.receive(message, senderUsername);
                break;
            }
        }
    }

    public List<String> getAllUserNames() {
        return users.stream()
                .map(controller -> controller.getUser().getName())
                .collect(Collectors.toList());
    }
}