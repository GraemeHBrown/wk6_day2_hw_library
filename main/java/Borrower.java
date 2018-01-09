import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int numberOfBorrowedBooks(){
        return this.borrowedBooks.size();
    }


}
