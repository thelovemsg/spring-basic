package hello.object_study.part11.composition;

import hello.object_study.part5.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
