import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int numberOfBorrowedBooks() {
        return this.borrowedBooks.size();
    }


    public void borrowBookFromLibrary(Library library, Book bookToLend) {
        if (library.hasBookInStock(bookToLend)) {
            library.lendBook(bookToLend);
            addToBorrowedBooks(bookToLend);
        }
    }

    private void addToBorrowedBooks(Book bookToAdd) {
        this.borrowedBooks.add(bookToAdd);
    }
}
