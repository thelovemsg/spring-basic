package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;

public class CarInventory {

    public static void main(String[] args) {
        CarFactoryInterface modelOne = new ModelOneFactory(new ModelOnePartsFactory());
        Car one = modelOne.makeCar();
        System.out.println("car = " + one);

        CarFactoryInterface modelTwo = new ModelTwoFactory(new ModelTwoPartsFactory());
        Car two = modelTwo.makeCar();
        System.out.println("car = " + two);
    }

}
