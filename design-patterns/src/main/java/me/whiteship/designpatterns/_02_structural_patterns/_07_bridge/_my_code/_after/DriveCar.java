package me.whiteship.designpatterns._02_structural_patterns._07_bridge._my_code._after;

public class DriveCar {

    public static void main(String[] args) {
        Car firstWhiteCar = new FirstCar(new WhiteColor());
        firstWhiteCar.back();
        firstWhiteCar.forward();

        Car firstBlackCar = new FirstCar(new BlackColor());
        firstBlackCar.back();
        firstBlackCar.forward();
    }

}
