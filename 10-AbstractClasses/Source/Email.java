public class Email extends Message {
    private String address;
    private String subject;

    public Email(String text, String address, String subject) {
        super(text);
        this.address = address;
        this.subject = subject;
    }
    public Email(String address, String subject) {
        super();
        this.address = address;
        this.subject = subject;
    }

    public String addressAccessor() {
        return address;
    }
    public String subjectAccessor() {
        return subject;
    }
    public void addressMutator(String address) {
        this.address = address;
    }
    public void subjectMutator(String subject) {
        this.subject = subject;
    }

    public void send(){
        System.out.println("Sent to: "+this.address);
        System.out.println("Subject: "+this.subject);
        System.out.println("---\n"+this.textAccessor()+"\n---\n");
    }
}
