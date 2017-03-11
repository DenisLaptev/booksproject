import model.Book;

/**
 * Created by Lenovo on 11.03.2017.
 */
public class app {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("Title0", "Author0", 2000);
        books[1] = new Book("Title1", "Author1", 2010);
        books[2] = new Book("Title2", "Author2", 2017);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

    }
}
