import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    Library library, library2, library3;
    Book book, book2;

    @Before
    public void before(){
        library = new Library(300);
        library2 = new Library(1);
        library3 = new Library(30);
        book = new Book("Gone with the Wind", "Margaret Mitchell", "historical");
        book2 = new Book("Mandela", "Anthony Sampson", "biography");
        library2.addBook(book);
    }

    @Test
    public void canCountLibraryStock(){
        assertEquals(1, library2.stockCount());
    }

    @Test
    public void addBookToLibraryStockIncreasesStockCount(){
        int stockCountBeforeAdd = library.stockCount();
        library.addBook(book);
        assertEquals(stockCountBeforeAdd+1, library.stockCount());
    }

    @Test
    public void libraryHasStockCapacity(){
        assertEquals(300, library.getStockCapacity());
    }

    @Test
    public void cantAddBookIfStockCapacityExceeded(){
        int stockCountBeforeAdd = library2.stockCount();
        library2.addBook(book);
        assertEquals(stockCountBeforeAdd, library2.stockCount());
    }

    @Test
    public void hasBookInStockReturnsTrue(){
        assertTrue(library2.hasBookInStock(book));
    }

    @Test
    public void bookNotInStockReturnsFalse(){
        assertFalse(library.hasBookInStock(book));
    }

    @Test
    public void lendingBookReducesStockCount(){
        int countBeforeLending = library2.stockCount();
        library2.lendBook(book);
        assertEquals(countBeforeLending-1, library2.stockCount());
    }

    @Test
    public void libraryDoesNotHaveLentBookInStock(){
        library2.lendBook(book);
        assertFalse(library2.hasBookInStock(book));
    }

    @Test
    public void genresHash(){
        library3.addBook(book);
        library3.addBook(book);
        library3.addBook(book);
        library3.addBook(book2);
        library3.addBook(book2);
        library3.createGenreCountHash();
    }
}
