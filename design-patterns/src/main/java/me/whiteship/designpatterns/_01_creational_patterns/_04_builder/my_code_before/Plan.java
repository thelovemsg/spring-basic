package me.whiteship.designpatterns._01_creational_patterns._04_builder.my_code_before;

import java.time.LocalDate;

public class Plan {

    public static void main(String[] args) {
        VacationPlan shortPlan = new VacationPlan();
        shortPlan.setTitle("방 콕 투어");
        shortPlan.setStartDate(LocalDate.of(2022,04,06));
        shortPlan.setDoPlace("집");

        VacationPlan longTripPlan = new VacationPlan();
        longTripPlan.setTitle("전국 일주");
        longTripPlan.setDays(3);
        longTripPlan.setStartDate(LocalDate.of(2022,04,10));
        longTripPlan.setPlans(0, "서울 여행");
        longTripPlan.setPlans(0, "남산 타워 가서 돈까스 먹기");
        longTripPlan.setPlans(1, "인천 송도 서킷가기");
        longTripPlan.setPlans(1, "인천 차이나타운 가기");
        longTripPlan.setPlans(1, "인천 월미도 가기");
        longTripPlan.setPlans(2, "노잼 도시 대전 방문");
        longTripPlan.setPlans(2, "노잼 도시 대전 둔산동 조지기");

    }

}
