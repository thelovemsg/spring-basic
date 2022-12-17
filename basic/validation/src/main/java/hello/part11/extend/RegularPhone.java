package hello.part11.extend;

import hello.part5.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class RegularPhone extends Phone {

    private Money amount;
    private Duration seconds;
    private List<Call> calls = new ArrayList<>();

    public RegularPhone(Money amount, Duration seconds) {
        super();
        this.amount = amount;
        this.seconds = seconds;
    }

    public void call(Call call) {
        calls.add(call);
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee;
    }

}
