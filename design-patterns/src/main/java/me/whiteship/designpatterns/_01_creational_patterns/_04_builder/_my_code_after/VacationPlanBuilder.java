package me.whiteship.designpatterns._01_creational_patterns._04_builder._my_code_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder.my_code_before.VacationPlan;

import java.time.LocalDate;

public interface VacationPlanBuilder {

    //VacationPlanBuilder를 통해서 메소드 체인이 되도록 함
    VacationPlanBuilder title(String title);

    VacationPlanBuilder days(int days);

    VacationPlanBuilder startDate(LocalDate startDate);

    VacationPlanBuilder doPlace(String doPlace);

    VacationPlanBuilder addPlan(int day, String plan);

    VacationPlan getPlan();



}
