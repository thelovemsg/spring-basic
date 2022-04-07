package me.whiteship.designpatterns._02_structural_patterns._07_bridge._my_code._before;

public class DriveCar {

    public static void main(String[] args) {
        Car car = new FirstWhiteCar();
        car.right();
        car.forward();
        car.left();
        car.back();
    }
}
