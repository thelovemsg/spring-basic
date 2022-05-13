package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._my_code;

public class DinnerContext {

//    private DinnerStrategy dinnerStrategy;
//
//    public DinnerContext(DinnerStrategy dinnerStrategy) {
//        this.dinnerStrategy = dinnerStrategy;
//    }

    public void makeDinner(DinnerStrategy dinnerStrategy){
        dinnerStrategy.makeDinner();
    }

    public void doTheDishes(DinnerStrategy dinnerStrategy){
        dinnerStrategy.doTheDishes();
    }


}
