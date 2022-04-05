package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._my_code;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Blackship;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("model1")) {
            return new ModelOneWhiteCar();
        } else if (name.equals("model2")) {
            return new ModelTwoBlackCar();
        }

        throw new IllegalArgumentException();
    }
}
