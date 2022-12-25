//package hello.object_study.part4;
//
//import hello.object_study.part2.Money;
//import hello.object_study.part5.DiscountCondition;
//
//
///**
// * Single Responsibility Principle (SRP)
// * => 응집도가 너무 낮고, 여러 객체들이 얽혀 있어서(결합도가 높음) 수정이 일어날 확률이 너무 높다.
// * => SRP란 클래스는 단 한 가지의 변경 이유만 가져야 한다는 것!
// */
//public class ReservationAgency {
//    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
//        boolean discountable = checkDiscountable(screening);
//        Money fee = calculateFee(screening, discountable, audienceCount);
//        return createReservation(screening, customer, audienceCount, fee);
//    }
//
//    private Reservation createReservation(Screening screening, Customer customer, int audienceCount, Money fee) {
//        return null;
//    }
//
//    private Money calculateFee(Screening screening, boolean discountable, int audienceCount) {
//    }
//
//    private boolean checkDiscountable(Screening screening){
//        return screening.getMovie().getDiscountConditions().stream()
//                .anyMatch(condition -> isDiscountable(condition, screening));
//
//    }
//
//    private boolean isDiscountable(DiscountCondition condition, Screening screening){
//        if (condition.getType() == DiscountConditionType.PERIOD){
//            return isSatisfiedByPeriod(condition, screening);
//        }
//
//        return isSatisfiedBySequence(condition, screening);
//    }
//
//    private boolean isSatisfiedByPeriod(DiscountCondition_Data condition, Screening screening) {
//        return screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
//                condition.getStartTime().compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
//                condition.getEndTime().compareTo(screening.getWhenScreened().toLocalTime()) >=0;
//    }
//
//    private boolean isSatisfiedBySequence(DiscountCondition_Data condition, Screening screening) {
//        return condition.getSequence() == screening.getSequence();
//    }
//}
