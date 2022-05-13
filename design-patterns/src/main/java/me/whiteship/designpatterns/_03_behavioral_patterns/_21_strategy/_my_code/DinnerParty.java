package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._my_code;

public class DinnerParty {

    public static void main(String[] args) {
        DinnerContext meal = new DinnerContext();
        meal.makeDinner(new NormalDinner());
        meal.doTheDishes(new NormalDinner());

        meal.makeDinner(new FastDinner());
        meal.doTheDishes(new FastDinner());
    }

}
