public class EBook extends Book{
    //attributes
    private String fileName;

    //methods
    public void display() {
        super.display();
        System.out.print("File name: "+this.fileName+"\n");
    }

    //getters and setters
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //constructor
    public EBook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }
}
