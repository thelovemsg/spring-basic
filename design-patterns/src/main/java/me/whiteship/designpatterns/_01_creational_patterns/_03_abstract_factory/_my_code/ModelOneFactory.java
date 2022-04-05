package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;

public class ModelOneFactory implements CarFactoryInterface {

    private CarPartsFactory carPartsFactory;

    public ModelOneFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car makeCar() {
        Car car = new ModelOne();
        car.setFrame(carPartsFactory.createFrame());
        car.setAirbag(carPartsFactory.createAirbag());
        return car;
    }
}
