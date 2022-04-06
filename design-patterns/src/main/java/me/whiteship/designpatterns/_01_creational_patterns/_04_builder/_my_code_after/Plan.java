package me.whiteship.designpatterns._01_creational_patterns._04_builder._my_code_after;

import me.whiteship.designpatterns._01_creational_patterns._04_builder.my_code_before.VacationPlan;

import java.time.LocalDate;

public class Plan {

    public static void main(String[] args) {
        VacationDirector director = new VacationDirector(new DefaultVacationBuilder());
        VacationPlan roomPlan = director.roomPlan();
        VacationPlan countryPlan = director.countryPlan();

    }

}
