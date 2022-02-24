public class Battery {
    private String model;
    private float hoursIdle;
    private float hoursTalk;
    private BatteryType batteryType;

    public Battery() {
        this.model = null;
        this.hoursIdle = 0;
        this.hoursTalk = 0;
        this.batteryType=null;
    }

    public Battery(String model, float hoursIdle, float hoursTalk, BatteryType batteryType) {
        this.model = model;
        this.hoursIdle = hoursIdle;
        this.hoursTalk = hoursTalk;
        this.batteryType = batteryType;
    }

    public Battery(String model) {
        this.model = model;
        this.hoursIdle = 0;
        this.hoursTalk = 0;
        this.batteryType=null;
    }

    @Override
    public String toString() {
        String infoBattery=String.format("Model:%s\tHours Idles:%.1f\tHours Talk:%.1f\tBatteryType:",model,hoursIdle,hoursTalk);
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
