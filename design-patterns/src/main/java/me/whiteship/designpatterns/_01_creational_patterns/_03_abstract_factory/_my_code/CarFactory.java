package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;

public class CarFactory implements CarFactoryInterface {

    //어떤 제품군을 만들어주는 Factory를 생성자를 넣어줌으로써
    //차를 만들 때 각기 다른 부품을 조합해서 생성 가능

    private CarPartsFactory carPartsFactory;

    public CarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car makeCar() {
//        모델 1 모델 양산시
        ModelOne modelOne = new ModelOne();
        car.setFrame(carPartsFactory.createFrame());
        car.setAirbag(carPartsFactory.createAirbag());
        //모델 2 양산시

        return null;
    }

}
