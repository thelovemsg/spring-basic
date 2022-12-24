package hello.object_study.part5;

/**
 * 역할은 다른 것으로 교체할 수 있는 책임의 집합이다.
 * => DiscountPolicy -> AmountDiscountPolicy
 *                   -> PercentDiscountPolicy
 */
public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
