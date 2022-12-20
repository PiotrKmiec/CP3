public class SMS extends Message {
    private String number;

    public SMS(String text, String number) {
        super(text);
        this.number = number;
    }
    public SMS(String number) {
        super();
        this.number = number;
    }

    public String numberAccessor() {
        return number;
    }
    public void numberMutator(String number) {
        this.number = number;
    }

    public void send(){
        System.out.println("Sent to: "+this.number);
        System.out.println("---\n"+this.textAccessor()+"\n---\n");
    }
    
}
