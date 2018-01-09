import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

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

    public void createGenreCountHash() {
        HashMap<String, Integer> genreMap = new HashMap<>();
        ArrayList<String> genreList = new ArrayList<>();
        for (Book book : this.collection) {
            genreList.add(book.getGenre());
        }

        for (String genre : genreList) {
            if (genreMap.containsKey(genre)) {
                genreMap.put(genre, genreMap.get(genre) + 1);
            } else {
                genreMap.put(genre, 1);
            }
        }

//        System.out.println(genreMap);
    }
}
