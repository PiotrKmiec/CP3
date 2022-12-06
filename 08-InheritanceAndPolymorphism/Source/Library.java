import java.util.ArrayList;

public class Library {
    //attributes
    private ArrayList<Book> books;

    //methods
    public void displayBooks() {
        for(Book book : books) {
            book.display();
        }
    }

    public void displayBooks(int index) {
        this.books.get(index).display();
    }

    public void displayBooks(int[] indices) {
        for(int index : indices) {
            this.displayBooks(index);
        }
    }

    //getters and setters
    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book getBook(int index) {
        return this.books.get(index);
    }

    //constructor
    public Library() {
        this.books = new ArrayList<Book>();
    }
}
