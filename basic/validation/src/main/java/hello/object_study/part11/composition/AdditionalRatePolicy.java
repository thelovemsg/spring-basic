package hello.object_study.part11.composition;

import hello.object_study.part5.Money;

public abstract class AdditionalRatePolicy implements RatePolicy{
    private RatePolicy next;

    public AdditionalRatePolicy(RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(Phone phone) {
        Money fee = next.calculateFee(phone);
        return afterCalculated(fee);
    }

    protected abstract Money afterCalculated(Money fee);
}
