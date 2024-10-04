package Assignment10;

public class DevelopmentHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.DEVELOPMENT_REQUEST) {
            System.out.println("DevelopmentHandler: We will get back to you soon, " + message.getSenderEmail() + ".");
            System.out.println("Your message: " + message.getMessageContent());
        } else {
            System.out.println("DevelopmentHandler: Forwarding message to next handler.");
            this.getNextHandler().handle(message);
        }
    }
}
