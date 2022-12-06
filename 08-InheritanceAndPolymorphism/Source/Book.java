public class Book{
    //properties
    private String title;
    private String author;

    //methods
    public void display() {
        System.out.print("\nTitle: "+this.title+"\nAuthor: "+this.author+"\n");
    }

    //getter and setters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    //constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}