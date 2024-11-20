package Assignment19;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class UserController implements IUser {
    private User user;
    private Mediator mediator;

    @FXML
    private TextArea chatArea;

    @FXML
    private ComboBox<String> chatReceiver;

    @FXML
    private TextField chatMessage;


    public void initialize() {
        chatReceiver.getItems().addAll("user1", "user2", "user3");
    }

    public void sendBtn(ActionEvent actionEvent) {
        sendMessage();
    }

    @FXML
    private void sendMessage() {
        String message = chatMessage.getText();
        String receiver = chatReceiver.getValue();
        String sender = user.getName();

        chatArea.appendText("You: " + message + "\n" + "To: " + receiver + "\n");
        chatMessage.clear();
        send(message, sender, receiver);
    }
    public UserController() {
        this.mediator = Mediator.getInstance();
    }

    public UserController(User user) {
        this.user = user;
        this.mediator = Mediator.getInstance();
        mediator.addUserController(this);
    }

    public User getUser() {
        return user;
    }

    @Override
    public void send(String message, String senderUsername, String receiverUsername) {
        mediator.send(message, senderUsername, receiverUsername);
    }

    @Override
    public void receive(String message, String username) {
        chatArea.appendText(username + ": " + message + "\n");

    }
}