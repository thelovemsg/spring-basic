package hello.object_study.part5;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDefaultDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
//        return screening.get5F().times(percent);
        return null;
    }
}
