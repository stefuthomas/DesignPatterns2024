package Assignment10;

public class Message {
    private MessageType type;
    private String messageContent, senderEmail;

    public Message(MessageType type, String messageContent, String senderEmail) {
        this.type = type;
        this.messageContent = messageContent;
        this.senderEmail = senderEmail;
    }

    public MessageType getType() {
        return type;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getSenderEmail() {
        return senderEmail;
    }
}
