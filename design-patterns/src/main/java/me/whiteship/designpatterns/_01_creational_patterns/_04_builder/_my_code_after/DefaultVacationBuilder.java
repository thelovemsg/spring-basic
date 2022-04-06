package me.whiteship.designpatterns._01_creational_patterns._04_builder._my_code_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder.my_code_before.VacationDetailPlan;
import me.whiteship.designpatterns._01_creational_patterns._04_builder.my_code_before.VacationPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultVacationBuilder implements VacationPlanBuilder{

    private String title;

    private int days;

    private LocalDate startDate;

    private List<VacationDetailPlan> plans;

    private String doPlace;

    @Override
    public VacationPlanBuilder title(String title) {
        this.title = title;
        return this;
        /*
        this를 return하게 된다면 VacationPlanBuilder의
        구현체인 DefaultVacationBuilder가 return된다.
        그렇게 되면 VacationPlanBuilder가 제공하는 다른 메소드를
        다시 사용할 수 밖에 없다.
        */
    }

    @Override
    public VacationPlanBuilder days(int days) {
        this.days = days;
        return this;
    }

    @Override
    public VacationPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public VacationPlanBuilder doPlace(String doPlace) {
        this.doPlace = doPlace;
        return this;
    }

    @Override
    public VacationPlanBuilder addPlan(int day, String plan) {
        if (this.plans == null){
            this.plans = new ArrayList<>();
        }
        this.plans.add(new VacationDetailPlan(day, plan));
        return this;
    }

    @Override
    public VacationPlan getPlan() {
        return new VacationPlan(title, days, startDate, plans, doPlace);
    }
}
