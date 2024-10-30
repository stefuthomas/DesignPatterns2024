package Assignment13;

public class Main {
    public static void main(String[] args) {
        // Create a directory structure
        Directory root = new Directory("root");
        Directory textFiles = new Directory("Text Files");
        Directory musicFiles = new Directory("Music Files");
        Directory videoFiles = new Directory("Video Files");
        Directory documents = new Directory("Documents");

        File textFile1 = new File("textFile1.txt", 10);
        File textFile2 = new File("textFile2.txt", 20);

        File musicFile1 = new File("musicFile1.mp3", 30);
        File musicFile2 = new File("musicFile2.mp3", 40);

        File videoFile1 = new File("videoFile1.mp4", 50);
        File videoFile2 = new File("videoFile2.mp4", 60);

        File document1 = new File("document1.doc", 70);
        File document2 = new File("document2.doc", 80);

        root.addElement(textFiles);
        root.addElement(musicFiles);
        root.addElement(videoFiles);
        root.addElement(documents);

        textFiles.addElement(textFile1);
        textFiles.addElement(textFile2);

        musicFiles.addElement(musicFile1);
        musicFiles.addElement(musicFile2);

        videoFiles.addElement(videoFile1);
        videoFiles.addElement(videoFile2);

        documents.addElement(document1);
        documents.addElement(document2);

        // Create a SearchVisitor and search for files (change the search criteria if needed)
        SearchVisitor searchVisitor = new SearchVisitor();
        searchVisitor.setSearchCriteria("mp3");
        root.accept(searchVisitor);
        for (String result : searchVisitor.getSearchResults()) {
            System.out.println("Found: " + result);
        }

        // Create a SizeCalculatorVisitor and calculate the total size of the directory structure
        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        root.accept(sizeCalculator);
        System.out.println("Total size of the directory structure: " + sizeCalculator.getTotalSize());
    }
}
