package hello.part14.composition.policy.impimentation.fix;

import hello.part14.composition.policy.Call;
import hello.part14.composition.policy._interface.BasicRatePolicy;
import hello.part5.Money;

import java.time.Duration;

public class FixedFeePolicy extends BasicRatePolicy {

    private Money amount;
    private Duration seconds;

    public FixedFeePolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
