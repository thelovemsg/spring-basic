package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._my_code;

public class Customer {

    public static void main(String[] args) {
        /*
        Car model1 = CarFactory.makeCar("model1", "seoul");
        System.out.println("model1 = " + model1);

        System.out.println("=======================");

        Car model2 = CarFactory.makeCar("model2", "daejeon");
        System.out.println("model2 = " + model2);
        */

        Car car1 = new ModelOneWhiteCarFactory().orderCar("model1", "seoul");
        System.out.println(car1);

        Car car2 = new ModelTwoBlackCarFactory().orderCar("model2", "daejeon");
        System.out.println(car2);
    }

}
