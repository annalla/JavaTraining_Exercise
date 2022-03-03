package gsm;

import java.util.Objects;

public class Battery {
    private String model;
    private double hoursIdle;
    private double hoursTalk;
    private BatteryType batteryType;

    public Battery() {
        this.model = "";
        this.hoursIdle = 0;
        this.hoursTalk = 0;
        this.batteryType = null;
    }

    public Battery(String model, double hoursIdle, double hoursTalk, BatteryType batteryType) {
        this.model = Objects.requireNonNullElse(model, "");
        this.hoursIdle = hoursIdle < 0 ? 0 : hoursIdle;
        this.hoursTalk = hoursTalk < 0 ? 0 : hoursTalk;
        this.batteryType = batteryType;
    }

    public Battery(String model) {
        this.model = Objects.requireNonNullElse(model, "");
        this.hoursIdle = 0;
        this.hoursTalk = 0;
        this.batteryType = null;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "model='" + model + '\'' +
                ", hoursIdle=" + hoursIdle +
                ", hoursTalk=" + hoursTalk +
                ", batteryType=" + batteryType +
                '}';
    }
}

