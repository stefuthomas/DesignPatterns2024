package Assignment12;

public class DocumentProxy implements IDocument {
    IDocument document;
    private String identifier, creationDate;

    public DocumentProxy(String identifier, String creationDate, Document document) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.document = document;
    }

    @Override
    public String getCreationDate(String identifier) {
        return creationDate;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (AccessControlService.getInstance().isAllowed(user.getUsername(), identifier)) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("Access Denied");
        }
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }
}