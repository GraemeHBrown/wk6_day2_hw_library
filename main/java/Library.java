import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;

    public Library(){
        this.collection = new ArrayList<Book>();
    }

    public int stockCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }
}
