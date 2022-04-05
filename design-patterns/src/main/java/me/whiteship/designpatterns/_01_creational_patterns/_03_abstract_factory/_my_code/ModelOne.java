package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._my_code.Car;

public class ModelOne extends Car {

    public ModelOne() {
        setName("model first");
        setColor("white");
        setPrice(10000);
    }

}
