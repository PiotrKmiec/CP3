public class Audiobook extends Book{
    //attributes
    private int minutes;
    private int seconds;

    //methods
    public void display() {
        super.display();
        System.out.print("Time: "+this.minutes+":"+this.seconds+"\n");
    }

    //getters and setters
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    //constructor
    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }
}