package hello.part5;

import java.time.Duration;

public class AmountDiscountMovie extends Movie{

    private Money discountAmount;

    public AmountDiscountMovie(String title, Duration runningTime, Money discountAmount, DiscountCondition... discountConditions) {
        super(title, runningTime, discountAmount, discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount() {
        return null;
    }
}
