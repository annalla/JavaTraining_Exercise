import java.util.LinkedList;

public class GSM {
    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    private Battery battery;
    private  Display display;
    private LinkedList<GSM> callHistory=new LinkedList<>();

    public static GSM iphone4s =new GSM("Iphone4S","Apple",221.3,"Apple",new Battery("IPS4 56",23,8,BatteryType.LiIon),new Display((float)4.4,2));

    public GSM() {
        this.model = null;
        this.manufacturer = null;
        this.price = 0;
        this.owner = null;
        this.battery = null;
        this.display = null;
    }

    public GSM(String model, String manufacturer, double price, String owner, Battery battery, Display display) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
        this.battery = battery;
        this.display = display;
    }

    public GSM(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = 0;
        this.owner = null;
        this.battery = null;
        this.display = null;
    }

    @Override
    public String toString() {
        return String.format("Model:%s\nManufacturer:%s\nPrice:%.2f$\nOwner:%s\nBattery:%s\nDisplay:%s",model,manufacturer,price,owner,battery.toString(),display.toString());
    }
}
