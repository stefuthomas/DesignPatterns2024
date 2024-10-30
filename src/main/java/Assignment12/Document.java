package Assignment12;

public class Document implements IDocument {
    private String identifier, content, creationDate;
    public Document(String identifier, String content, String creationDate) {
        this.identifier = identifier;
        this.content = content;
        this.creationDate = creationDate;
    }

    @Override
    public String getCreationDate(String identifier) {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }
}
