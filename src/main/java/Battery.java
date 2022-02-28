public class Battery {
    private String model;
    private float hoursIdle;
    private float hoursTalk;
    private final BatteryType batteryType;

    public Battery() {
        this.model = null;
        this.hoursIdle = 0;
        this.hoursTalk = 0;
        this.batteryType = null;
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
        this.batteryType = null;
    }

//    @Override
//    public String toString() {
//        String infoBattery = String.format("Model:%s\tHours Idles:%.1f\tHours Talk:%.1f\tBatteryType:",model,hoursIdle,hoursTalk);
//        assert this.batteryType != null;
//        return switch (this.batteryType) {
//            case NiCd -> infoBattery + "NiCd";
//            case NiMH -> infoBattery + "NiMH";
//            case LiIon -> infoBattery + "LiIon";
//        };
//    }

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
