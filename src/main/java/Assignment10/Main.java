package Assignment10;

public class Main {
    public static void main(String[] args) {
        Handler compensationClaimHandler = new CompensationHandler();
        Handler contactRequestHandler = new ContactHandler();
        Handler developmentRequestHandler = new DevelopmentHandler();
        Handler generalFeedbackHandler = new FeedbackHandler();

        compensationClaimHandler.setNextHandler(contactRequestHandler);
        contactRequestHandler.setNextHandler(developmentRequestHandler);
        developmentRequestHandler.setNextHandler(generalFeedbackHandler);

        Message feedbackMessage = new Message(MessageType.GENERAL_FEEDBACK, "I love your product!", "fred.feedbacker@mail.com");
        Message compensationMessage = new Message(MessageType.COMPENSATION_CLAIM, "I want a refund!", "ralph.refunder@email.ru");
        Message contactMessage = new Message(MessageType.CONTACT_REQUEST, "I want to talk to someone!", "craig.contactor@mail.fi");
        Message developmentMessage = new Message(MessageType.DEVELOPMENT_REQUEST, "I want a new feature!", "dave.developer@mail.us");

        compensationClaimHandler.handle(feedbackMessage);
        System.out.println("-------------------------------------------------");
        compensationClaimHandler.handle(compensationMessage);
        System.out.println("-------------------------------------------------");
        compensationClaimHandler.handle(contactMessage);
        System.out.println("-------------------------------------------------");
        compensationClaimHandler.handle(developmentMessage);

    }
}