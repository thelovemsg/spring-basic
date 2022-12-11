package hello.part4;

import hello.part2.Money;


/**
 * Single Responsibility Principle (SRP)
 * => 응집도가 너무 낮고, 여러 객체들이 얽혀 있어서(결합도가 높음) 수정이 일어날 확률이 너무 높다.
 * => SRP란 클래스는 단 한 가지의 변경 이유만 가져야 한다는 것!
 */
public class Before_ReservationAgency {
    public Reservation reserve(Screening_Data screening_data, Customer customer, int audienceCount) {
        Movie_Data movie = screening_data.getMovie();
        boolean discountable = false;
        for (DiscountCondition_Data condition : movie.getDiscountConditions()) {
            if(condition.getType() == DiscountConditionType.PERIOD){
                discountable = screening_data.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek())
                        && condition.getStartTime().compareTo(screening_data.getWhenScreened().toLocalTime()) <= 0
                        && condition.getEndTime().compareTo(screening_data.getWhenScreened().toLocalTime()) >=0;
            } else {
                discountable = condition.getSequence() == screening_data.getSequence();
            }

            if (discountable)
                break;
        }
        Money fee;

        if(discountable) {
            Money discountAmount = Money.ZERO;
            switch(movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                    discountAmount = movie.getDiscountAmount();
                    break;
                case PERCENT_DISCOUNT:
                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
                    break;
                case NONE_DISCOUNT:
                    discountAmount = Money.ZERO;
                    break;
            }

            fee = movie.getFee().minus(discountAmount).times(audienceCount);
        } else {
            fee = movie.getFee();
        }
        return new Reservation(customer, screening_data, fee, audienceCount);
    }
}
