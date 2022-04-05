package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._my_code;

public class ModelTwoBlackCarFactory implements CarFactoryInterface{

    @Override
    public Car makeCar() {
        return new ModelTwoBlackCar();
    }
}
