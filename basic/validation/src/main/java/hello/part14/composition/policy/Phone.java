package hello.part14.composition.policy;

import hello.part14.composition.policy.Call;
import hello.part14.composition.policy._interface.RatePolicy;
import hello.part5.Money;

import java.util.ArrayList;
import java.util.List;

/**
 * 내부에 RatePolicy에 대한 참조자가 포함돼 있다는 것에 주목하라.
 * 이것이 바로 합성이다!
 *  Phone이 다양한 요금 정책과 협력할 수 있어야 하므로 요금 정책의 타입이 RatePolicy라는 인터페이스로 정의돼 있다는 것에도 주목하라!
 *
 */
public class Phone {
    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }

    public void call(Call call) {

    }
}
