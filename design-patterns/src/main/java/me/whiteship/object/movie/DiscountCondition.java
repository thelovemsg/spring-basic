package me.whiteship.object.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
