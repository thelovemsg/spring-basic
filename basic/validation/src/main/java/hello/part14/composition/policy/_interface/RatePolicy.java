package hello.part14.composition.policy._interface;

import hello.part14.composition.policy.Phone;
import hello.part5.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
