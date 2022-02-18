package realbasic.core.discount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import realbasic.core.annotation.MainDiscountPolicy;
import realbasic.core.member.Grade;
import realbasic.core.member.Member;

@Component
//@Qualifier("mainDiscountPolicy")
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        }else{
            return 0;
        }
    }

}
