package hello.object_study.part11.extend;

import hello.part14.composition.policy.DateTimeInterval;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Call {

    private DateTimeInterval interval;

    private LocalDateTime from;
    private LocalDateTime to;

    public Call(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }
    public Duration getDuration() {
        return Duration.between(from, to);
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public List<DateTimeInterval> splitByDay() {
        return interval.splitByDay();
    }

    public DateTimeInterval getInterval() {
        return interval;
    }
}
