package hello.part14.composition.policy.impimentation;

import hello.part11.extend.Call;
import hello.part14.composition.policy.Phone;
import hello.part14.composition.policy._interface.BasicRatePolicy;
import hello.part5.Money;

import java.time.Duration;

public class RegularPolicy extends BasicRatePolicy {

    private Money amount;
    private Duration seconds;

    public RegularPolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }

    @Override
    public Money calculateFee(Phone phone) {
        return null;
    }
}
