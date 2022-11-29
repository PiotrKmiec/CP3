public class Computer {
    private String name;
    private String type_of_motherboard;
    private int capacity;
    private String brand;
    private Processor processor;

    
    public double compute(){
        return 0;
    }
    public void run_program(){}
    public void create_file(){}
    public void display(){}
    public void turn_on(){}

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType_of_motherboard() {
        return type_of_motherboard;
    }
    public void setType_of_motherboard(String type_of_motherboard) {
        this.type_of_motherboard = type_of_motherboard;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Processor getProcessor() {
        return processor;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    public void turn_off(){}

    // constructor method
    public Computer(
    String name,
    String type_of_motherboard,
    int capacity,
    String brand,
    String CPUbrand,
    String model,
    double frequency,
    String socket) 
    {
        this.name = name;
        this.type_of_motherboard = type_of_motherboard;
        this.capacity = capacity;
        this.brand = brand;
        this.processor = new Processor(CPUbrand, model, frequency, socket);
    }
}