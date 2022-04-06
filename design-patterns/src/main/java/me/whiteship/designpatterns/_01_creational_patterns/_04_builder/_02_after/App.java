package me.whiteship.designpatterns._01_creational_patterns._04_builder._02_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
       /* TourPlanBuilder builder  = new DefaultTourBuilder();
        TourPlan plan1 = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(202, 11, 11))
                .whereToStay("resort")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁식사")
                .getPlan();

        TourPlan longBeachTrip = builder.title("롱 비치")
                .startDate(LocalDate.of(2022,11,11))
                .getPlan();*/

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();

    }
}
