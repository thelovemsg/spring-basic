package me.whiteship.designpatterns._01_creational_patterns._04_builder.my_code_before;

import java.time.LocalDate;
import java.util.List;

public class VacationPlan {

    private String title;

    private int days;

    private LocalDate startDate;

    private List<VacationDetailPlan> plans;

    private String doPlace;

    public VacationPlan() {
    }

    public VacationPlan(String title, int days, LocalDate startDate, List<VacationDetailPlan> plans, String doPlace) {
        this.title = title;
        this.days = days;
        this.startDate = startDate;
        this.plans = plans;
        this.doPlace = doPlace;
    }

    @Override
    public String toString() {
        return "VacationPlan{" +
                "title='" + title + '\'' +
                ", days='" + days + '\'' +
                ", startDate=" + startDate +
                ", plans=" + plans +
                ", doPlace='" + doPlace + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public List<VacationDetailPlan> getPlans() {
        return plans;
    }

    public void setPlans(int days, String plans) {
        this.plans.add(new VacationDetailPlan(days, plans));
    }

    public String getDoPlace() {
        return doPlace;
    }

    public void setDoPlace(String doPlace) {
        this.doPlace = doPlace;
    }
}
