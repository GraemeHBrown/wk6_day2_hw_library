import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(300);
        book = new Book("Gone with the Wind",
                "Margaret Mitchell", "historical");
        library.addBook(book);
    }

    @Test
    public void listIsEmptyBeforeBorrowing(){
        assertEquals(0, borrower.numberOfBorrowedBooks());
    }

    @Test
    public void borrowingBookIncreasesBorrowedBookCount(){
        int countBeforeBorrowing = borrower.numberOfBorrowedBooks();
        borrower.borrowBookFromLibrary(library, book);
        assertEquals(countBeforeBorrowing+1, borrower.numberOfBorrowedBooks());
    }


}
