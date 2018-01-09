import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before(){
        book = new Book("Gone with the Wind", "Margaret Mitchell");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Gone with the Wind", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Margaret Mitchell", book.getAuthor());
    }
}
