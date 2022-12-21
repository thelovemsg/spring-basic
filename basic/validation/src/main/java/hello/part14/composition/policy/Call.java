package hello.part14.composition.policy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Call {
    private DateTimeInterval interval;

    public Call(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    private LocalDateTime from;
    private LocalDateTime to;

    public DateTimeInterval getInterval() {
        return interval;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public Duration getDuration() {
        return interval.duration();
    }

    public List<DateTimeInterval> splitByDay() {
        return interval.splitByDay();
    }

}
