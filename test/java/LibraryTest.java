import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library, library2;
    Book book;

    @Before
    public void before(){
        library = new Library(300);
        library2 = new Library(1);
        book = new Book("Gone with the Wind", "Margaret Mitchell", "historical");
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
}
