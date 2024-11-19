package Assignment18;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;
    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }
    @Override
    public Recommendation clone() throws CloneNotSupportedException {
        Recommendation clone = (Recommendation) super.clone();
        clone.books = new ArrayList<>();
        for (Book book : books) {
            clone.addBook(book.clone());
        }
        return clone;
    }
}
