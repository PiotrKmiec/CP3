public abstract class Message {
    private String text;

    public Message(String text){
        this.text = text;
    }
    public Message() {
        this.text = "";
    }

    public String textAccessor() {
        return text;
    }
    public void textMutator(String text) {
        this.text = text;
    }

    public int charNumber(){
        return this.text.length();
    }
    public abstract void send();
}
