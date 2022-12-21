package hello.part14.composition.policy.cooperatepattern;

import hello.part14.composition.policy.Call;
import hello.part14.composition.policy.DateTimeInterval;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
