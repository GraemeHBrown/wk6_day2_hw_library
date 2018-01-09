import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library, library2;
    Book book;

    @Before
    public void before(){
        library = new Library();
        library2 = new Library();
        book = new Book();
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
}
