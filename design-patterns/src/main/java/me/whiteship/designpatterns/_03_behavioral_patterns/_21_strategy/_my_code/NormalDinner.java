package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy._my_code;

public class NormalDinner implements DinnerStrategy {
    @Override
    public void makeDinner() {
        System.out.println("배고프네~ 밥먹자~ 구구구~");
    }

    @Override
    public void doTheDishes() {
        System.out.println("밥을 먹엇으면 설거지를 해야지");
    }
}
