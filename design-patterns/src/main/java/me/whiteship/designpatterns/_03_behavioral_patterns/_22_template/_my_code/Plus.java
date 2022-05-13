package me.whiteship.designpatterns._03_behavioral_patterns._22_template._my_code;

public class Plus extends Calculator{
    @Override
    protected int getResult(int a, int b) {
        return a + b;
    }
}
