package hello.object_study.part10.improvement_extends_not_good;

import hello.object_study.part10.notdry.Call;
import hello.object_study.part5.Money;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone{
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds) {
        super(nightlyAmount, regularAmount, seconds);
        this.nightlyAmount = nightlyAmount;
    }

    @Override
    public Money calculateFee() {
        //부모 클래스의 calculateFee 호출
        Money result = super.calculateFee();

        Money nightlyFee = Money.ZERO;
        for (Call call : getCalls()) {
            if(call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
                nightlyFee = nightlyFee.plus(getAmount().minus(nightlyAmount).times(call.getDuration().getSeconds()/ getSeconds().getSeconds()));
            }
        }
        return result.minus(nightlyFee);
    }
}
