package Assignment18;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Recommendation> recommendations = new ArrayList<>();
    public static void main(String[] args) {
        Recommendation fantasyRecommendation = new Recommendation("Fantasy");
        fantasyRecommendation.addBook(new Book("George R. R. Martin", "A Game of Thrones"));
        fantasyRecommendation.addBook(new Book("George R. R. Martin", "A Clash of Kings"));
        fantasyRecommendation.addBook(new Book("George R. R. Martin", "A Storm of Swords"));
        addRecommendation(fantasyRecommendation);

        Recommendation historyRecommendation = new Recommendation("History");
        historyRecommendation.addBook(new Book("Yuval Noah Harari", "Sapiens: A Brief History of Humankind"));
        historyRecommendation.addBook(new Book("Irving Finkel", "I am Ashurbanipal: King of the World, King of Assyria"));
        historyRecommendation.addBook(new Book("Sun Tzu", "The Art of War"));
        addRecommendation(historyRecommendation);

        Recommendation scienceFictionRecommendation = new Recommendation("Science Fiction");
        scienceFictionRecommendation.addBook(new Book("Isaac Asimov", "Foundation"));
        scienceFictionRecommendation.addBook(new Book("Isaac Asimov", "Foundation and Empire"));
        scienceFictionRecommendation.addBook(new Book("Isaac Asimov", "Second Foundation"));
        addRecommendation(scienceFictionRecommendation);

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("1) Clone a recommendation" +
                    "\n2) List all recommendations" +
                    "\n3) Clone a book in recommendation" +
                    "\n4) Exit");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Recommendation to clone:");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println((i + 1) + ") " + recommendations.get(i).getTargetAudience());
                    }
                    int index = s.nextInt() - 1;
                    try {
                        Recommendation clone = recommendations.get(index).clone();
                        System.out.println("Cloned recommendation: " + clone.getTargetAudience());
                        addRecommendation(clone);
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    for (Recommendation recommendation : recommendations) {
                        System.out.println(recommendation.getTargetAudience());
                        for (Book book : recommendation.getBooks()) {
                            System.out.println("\t" + book.getAuthor() + " - " + book.getTitle());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Recommendation:");
                    for (int i = 0; i < recommendations.size(); i++) {
                        System.out.println((i + 1) + ") " + recommendations.get(i).getTargetAudience());
                    }
                    int recommendationIndex = s.nextInt() - 1;
                    System.out.println("Book to clone:");
                    for (int i = 0; i < recommendations.get(recommendationIndex).getBooks().size(); i++) {
                        System.out.println((i + 1) + ") " + recommendations.get(recommendationIndex).getBooks().get(i).getTitle());
                    }
                    int bookIndex = s.nextInt() - 1;
                    try {
                        Book clone = recommendations.get(recommendationIndex).getBooks().get(bookIndex).clone();
                        System.out.println("Cloned book: " + clone.getAuthor() + " - " + clone.getTitle());
                        recommendations.get(recommendationIndex).addBook(clone);
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void addRecommendation(Recommendation recommendation) {
        recommendations.add(recommendation);
    }
}
