public class Main {
    public static void main(String[] args){
        SMS sms = new SMS("xd", "555372042");
        sms.send();

        Email email = new Email("xd@xd.xd", "xd");
        email.textMutator("Hello.");
        email.send();
    }
}
