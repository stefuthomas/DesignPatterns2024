package Assignment12;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("johndoe");
        User user2 = new User("janedoe");

        library.createDocument("This is an unprotected document", "2021-01-01", "doc1");
        library.createProtectedDocument("This is a protected document for John", "2021-01-01", "doc2", "johndoe");
        library.createProtectedDocument("This is a protected document for Jane", "2021-01-01", "doc3", "janedoe");

        // Unprotected document that is accessible by anyone
        System.out.println(library.getDocument("doc1").getContent(user1));

        // Protected document that is accessible by John (Uncomment to test)
        //System.out.println(library.getDocument("doc2").getContent(user1));
        //System.out.println(library.getDocument("doc2").getContent(user2));

        // Protected document that is accessible by Jane
        System.out.println(library.getDocument("doc3").getContent(user2));
        System.out.println(library.getDocument("doc3").getContent(user1));

    }
}
