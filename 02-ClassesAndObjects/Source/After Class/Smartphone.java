import java.text.SimpleDateFormat;  
import java.util.Date;

public class Smartphone{
    // attributes
    String manufacturer;
    String model;
    int manufactureYear;
    private boolean isSupported;
    double screenSize;

    // methods
    public void printDetails(){
        this.updateDetails();

        System.out.print("\nManufacturer: "+this.manufacturer+"\nModel: "+this.model+"\nYear: "+this.manufactureYear+"\nScreen size: "+this.screenSize+"\"\n");
        if(this.isSupported){
            System.out.print("This model is still supported!\n");
        }else{
            System.out.print("This model is no longer supported!\n");
        }
    }
    private void updateDetails(){ // only smartphones manufactured less than 3 years ago are supported
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy");
        int year = Integer.parseInt(format.format(today));

        if(this.manufactureYear >= year-2){
            this.isSupported = true;
        }else{
            this.isSupported = false;
        }
    }
    public Smartphone(String manufacturer, String model, int manufactureYear, double screenSize){
        this.manufacturer = manufacturer;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.screenSize = screenSize;

        this.updateDetails();
    }
    public static void main(String[] args){
        Smartphone galaxy = new Smartphone("Samsung","Galaxy S9",2020,5.8);
        Smartphone iphone = new Smartphone("Apple","iPhone 11",2019,6.1);
        galaxy.printDetails();
        iphone.printDetails();
    }
}