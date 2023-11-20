package LibrarySys;

import java.util.Optional;
import java.util.stream.Stream;

public class LibraryCatalogSystem {
    public static void main(String[] args) {
        // Instantiate LibraryCatalog
        LibraryCatalog catalog = new LibraryCatalog();

        // Add several books to the catalog
        catalog.addBook(new Book("Java Programming", "John Doe", 2020, true));
        catalog.addBook(new Book("Data Structures and Algorithms", "Jane Smith", 2019, false));
        catalog.addBook(new Book("Introduction to Python", "Alice Johnson", 2021, true));

        // Test methods
        Optional<Book> bookByTitle = catalog.findBookByTitle("Java Programming");
        bookByTitle.ifPresentOrElse(
                book -> System.out.println("Book found: " + book.title()),
                () -> System.out.println("Book not found"));

        Optional<Book> availableBookByAuthor = catalog.findFirstAvailableBookByAuthor("Jane Smith");
        availableBookByAuthor.ifPresentOrElse(
                book -> System.out.println("Available book by Jane Smith: " + book.title()),
                () -> System.out.println("No available book by Jane Smith"));

        boolean updated = catalog.updateBookAvailability("Data Structures and Algorithms", true);
        if (updated) {
            System.out.println("Availability updated for 'Data Structures and Algorithms'");
        } else {
            System.out.println("Book not found for updating availability");
        }
    }
}