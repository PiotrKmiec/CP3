public class Processor {
    private String brand;
    private String model;
    private double frequency;
    private String socket;

    public double calculate(){
        return 0;
    }
    public void process(){}
    private double multiplication(){
        return 0;
    }
    private double addition(){
        return 0;
    }
    private double subtraction(){
        return 0;
    }
    // getters and setters
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    public String getSocket() {
        return socket;
    }
    public void setSocket(String socket) {
        this.socket = socket;
    }
    // constructor method
    public Processor(String brand, String model, double frequency, String socket) {
        this.brand = brand;
        this.model = model;
        this.frequency = frequency;
        this.socket = socket;
    }
    
}
