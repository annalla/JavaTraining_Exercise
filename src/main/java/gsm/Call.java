package gsm;

import java.time.LocalDate;
import java.time.LocalTime;

public class Call {
    private LocalDate date;
    private LocalTime time;
    private int durations;
    private String phoneNumber;

    public Call(LocalDate date, LocalTime time, int durations, String phoneNumber) {
        this.date = date;
        this.time = time;
        this.durations = durations;
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

