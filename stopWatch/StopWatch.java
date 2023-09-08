package stopWatch;

import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime = java.time.LocalTime.now();
    }

    public LocalTime start() {
        return this.startTime;
    }

    public LocalTime stop() {
        this.endTime = java.time.LocalTime.now();
        return this.endTime;
    }

    public String getElapsedTime() {
        String time = Duration.between(this.start(), this.stop()).toString();
        return time;
    }
}
