package Assignment19;

public interface IUser {
    void send(String message, String senderUsername, String receiverUsername);
    void receive(String message, String username);
}