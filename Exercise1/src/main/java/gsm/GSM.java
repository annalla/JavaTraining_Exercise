package gsm;

import java.util.ArrayList;
import java.util.Objects;

public class GSM {
    private final String model;
    private final String manufacturer;
    private final double price;
    private final String owner;
    private final Battery battery;
    private final Display display;
    private ArrayList<Call> callHistory = new ArrayList<>();

    public static GSM iphone4s = new GSM("Iphone4S", "Apple", 221.3, "Apple", new Battery("IPS4 56", 23, 8, BatteryType.LiIon), new Display((float) 4.4, 2));

    public GSM() {
        this.model = "";
        this.manufacturer = "";
        this.price = 0;
        this.owner = null;
        this.battery = null;
        this.display = null;
    }

    public GSM(String model, String manufacturer, double price, String owner, Battery battery, Display display) {
        this.model = Objects.requireNonNullElse(model, "");
        this.manufacturer = Objects.requireNonNullElse(manufacturer, "");
        this.price = price < 0 ? 0 : price;
        this.owner = owner.equals("") ? null : owner;
        this.battery = battery;
        this.display = display;
    }

    public GSM(String model, String manufacturer) {
        this.model = Objects.requireNonNullElse(model, "");
        this.manufacturer = Objects.requireNonNullElse(manufacturer, "");
        this.price = 0;
        this.owner = null;
        this.battery = null;
        this.display = null;
    }

    @Override
    public String toString() {
        return "Gsm{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                ", battery=" + battery +
                ", display=" + display +
                ", callHistory=" + callHistory +
                '}';
    }

    public boolean addCall(Call call) {
        if (call != null) {
            return callHistory.add(call);
        }
        return false;
    }

    public boolean deleteCall(int index) {
        try {
            callHistory.remove(index);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void clearCallHistory() {
        if (callHistory.size() != 0) {
            callHistory.clear();
            callHistory = new ArrayList<>();
        }
    }

    public double calculateTotalCallsPrice(double pricePerMinute) {
        double total = 0;
        for (Call call : callHistory) {
            total += (call.getDurations() / 60.0 * pricePerMinute);
        }
        return total;
    }

    public ArrayList<Call> getCallHistory() {
        return callHistory;
    }

    public void removeLongestCallHistory() {
        if (callHistory.size() != 0) {
            int indexMax = 0;
            for (int i = 1; i < callHistory.size(); i++) {
                if (callHistory.get(i).getDurations() > callHistory.get(indexMax).getDurations()) {
                    indexMax = i;
                }
            }
            deleteCall(indexMax);
        }
    }
}

