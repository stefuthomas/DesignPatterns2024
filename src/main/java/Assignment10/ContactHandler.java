package Assignment10;

public class ContactHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.CONTACT_REQUEST) {
            System.out.println("ContactHandler: We will forward your message to the appropriate department, " + message.getSenderEmail() + ".");
            System.out.println("Your message: " + message.getMessageContent());
        } else {
            System.out.println("ContactHandler: Forwarding message to next handler.");
            this.getNextHandler().handle(message);
        }
    }
}
