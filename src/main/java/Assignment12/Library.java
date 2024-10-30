package Assignment12;

import java.util.HashMap;

public class Library {
    private HashMap<String, IDocument> documents = new HashMap<>();

    public void addDocument(IDocument document) {
        documents.put(document.getIdentifier(), document);
    }

    public IDocument getDocument(String identifier) {
        return documents.get(identifier);
    }

    public void createDocument(String content, String creationDate, String identifier) {
        Document document = new Document(identifier, content, creationDate);
        addDocument(document);
    }

    public void createProtectedDocument(String content, String creationDate, String identifier, String username) {
        Document document = new Document(identifier, content, creationDate);
        DocumentProxy documentProxy = new DocumentProxy(identifier, creationDate, document);
        addDocument(documentProxy);
        AccessControlService.getInstance().addAccessControlList(username, identifier);
    }

}
