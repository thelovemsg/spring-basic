package me.whiteship.designpatterns._03_behavioral_patterns._22_template._my_code;

public class Main {

    public static void main(String[] args) {
        //1. 템플릿 메서드 패턴 사용
        Calculator calculator = new Plus();
        calculator.makeProcess("그냥더하기",1,2);
        calculator.executeProcess("그냥더하기");
        calculator.executeProcess("아무거나 입력하기");

        Calculator calculator1 = new DoublePlus();
        calculator.makeProcess("따블로 더하기1", 2, 2);
        calculator.executeProcess("따블로 더하기1");
        calculator1.makeProcess("따블로 더하기2", 4,4);
        calculator1.executeProcess("따블로 더하기2");

        //2. 템플릿 콜백 패턴 사용
        CalculatorForCallback calculatorForCallback = new CalculatorForCallback();
        calculatorForCallback.makeProcess("string", 1, 2, (a, b) -> a+b);
//        calculatorForCallback.makeProcess("string", 1, 2, new CallbackInterface() {
//            @Override
//            public int getResult(int a, int b) {
//                return a+b;
//            }
//        });
    }
}
