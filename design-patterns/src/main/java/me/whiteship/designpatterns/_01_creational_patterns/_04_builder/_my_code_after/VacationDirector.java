package me.whiteship.designpatterns._01_creational_patterns._04_builder._my_code_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder.my_code_before.VacationPlan;

import java.time.LocalDate;

public class VacationDirector {

    private VacationPlanBuilder vacationPlanBuilder;

    public VacationDirector(VacationPlanBuilder vacationPlanBuilder) {
        this.vacationPlanBuilder = vacationPlanBuilder;
    }

    public VacationPlan roomPlan(){
        return vacationPlanBuilder.title("방 콕 투어")
                .startDate(LocalDate.of(2022, 04, 01))
                .getPlan();
    }

    public VacationPlan countryPlan(){
        return vacationPlanBuilder.title("전국 투어").days(3)
                .startDate(LocalDate.of(2021, 12, 12))
                .doPlace("daejeon station")
                .addPlan(0, "호텔 잡기")
                .addPlan(0, "성심당 빵먹기")
                .getPlan();
    }

}
