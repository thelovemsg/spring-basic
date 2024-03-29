package hello.object_study.part11.composition;

import hello.object_study.part11.extend.Call;
import hello.object_study.part5.Money;

public abstract class BasicRatePolicy implements RatePolicy {

    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;
        for(Call call : phone.getCalls()){
            result.plus(calculateCallFee(call));
        }
        return result;
    }

    protected abstract Money calculateCallFee(Call call);
}
