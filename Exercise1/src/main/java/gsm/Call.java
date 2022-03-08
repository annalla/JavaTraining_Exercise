package gsm;

import java.time.LocalDate;
import java.time.LocalTime;

public class Call {
    private LocalDate date;
    private LocalTime time;
    private int durations;
    private String phoneNumber;

    public Call(int durations, String phoneNumber) {
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.durations = durations < 0 ? 0 : durations;
        this.phoneNumber = phoneNumber;
    }

    public int getDurations() {
        return durations;
    }

    @Override
    public String toString() {
        return "Call{" +
                "date=" + date +
                ", time=" + time +
                ", durations=" + durations +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}

