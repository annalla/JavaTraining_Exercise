public class Battery {
    private String model;
    private int hoursIdle;
    private int hoursTalk;
    private BatteryType batteryType;

    public Battery() {
        this.model = null;
        this.hoursIdle = 0;
        this.hoursTalk = 0;
    }

    public Battery(String model, int hoursIdle, int hoursTalk) {
        this.model = model;
        this.hoursIdle = hoursIdle;
        this.hoursTalk = hoursTalk;
    }

    public Battery(String model) {
        this.model = model;
        this.hoursIdle = 0;
        this.hoursTalk = 0;
    }

    @Override
    public String toString() {
        String infoBattery=String.format("Model:%s\tHours Idles:%d\tHours Talk:%d\tBatteryType:",model,hoursIdle,hoursTalk);
        switch (this.batteryType) {
            case NiCd:
                return infoBattery + "NiCd";
            case NiMH:
                return infoBattery + "NiMH";
            case LiIon:
                return infoBattery + "LiIon";
        }
        return null;
    }
}
