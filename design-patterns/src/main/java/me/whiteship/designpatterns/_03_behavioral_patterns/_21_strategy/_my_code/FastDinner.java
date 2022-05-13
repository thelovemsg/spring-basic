package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._my_code;

public class FastDinner implements DinnerStrategy {
    @Override
    public void makeDinner() {
        System.out.println("저녁밥을 빨리 만들자!");
    }

    @Override
    public void doTheDishes() {
        System.out.println("설거지는 빨리 하자!");
    }
}
