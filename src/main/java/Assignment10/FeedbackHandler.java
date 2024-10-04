package Assignment10;

public class FeedbackHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("FeedbackHandler: Thanks for your feedback, " + message.getSenderEmail() + "!");
            System.out.println("Your message: " + message.getMessageContent());
        } else {
            System.out.println("FeedbackHandler: Forwarding message to next handler.");
        }
    }
}
