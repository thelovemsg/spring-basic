package hello.part11.composition;

import hello.part5.Money;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
