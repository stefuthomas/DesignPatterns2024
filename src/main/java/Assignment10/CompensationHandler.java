package Assignment10;
import java.util.Random;

public class CompensationHandler extends Handler {
    @Override
    public void handle(Message message) {
        if (message.getType() == MessageType.COMPENSATION_CLAIM) {
            Random rand = new Random();
            int randomNum = rand.nextInt(2);
            if (randomNum == 0) {
                System.out.println("CompensationHandler: Your claim has been approved, " + message.getSenderEmail() + "!");
                System.out.println("Your message: " + message.getMessageContent());
            } else {
                System.out.println("CompensationHandler: Your claim has been denied, " + message.getSenderEmail() + "!");
                System.out.println("Your message: " + message.getMessageContent());
            }
        } else {
            System.out.println("CompensationHandler: Forwarding message to next handler.");
            this.getNextHandler().handle(message);
        }
    }

}
