import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int stockCapacity;

    public Library(int capacity) {
        this.collection = new ArrayList<Book>();
        this.stockCapacity = capacity;
    }

    public int stockCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (hasCapacity()) {
            this.collection.add(book);
        }
    }

    public int getStockCapacity() {
        return this.stockCapacity;
    }

    private boolean hasCapacity() {
        if (stockCount() < this.stockCapacity) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasBookInStock(Book book) {
        if (this.collection.contains(book)) {
            return true;
        }
        return false;
    }

    public void lendBook(Book bookToLend) {
        this.collection.remove(bookToLend);
    }
}
