package LibrarySys;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class LibraryCatalog {
    private final List<Book> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Optional<Book> findBookByTitle(String title) {
        return books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst();
    }

    public Optional<Book> findFirstAvailableBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.author().equalsIgnoreCase(author) && book.availability())
                .findFirst();
    }

    public boolean updateBookAvailability(String title, boolean availability) {
        Optional<Book> bookOptional = findBookByTitle(title);
        if (bookOptional.isPresent()) {
            Book book = bookOptional.get();
            book = new Book(book.title(), book.author(), book.year(), availability);
            books.removeIf(b -> b.title().equalsIgnoreCase(title));
            books.add(book);
            return true;
        }
        return false;
    }
}
