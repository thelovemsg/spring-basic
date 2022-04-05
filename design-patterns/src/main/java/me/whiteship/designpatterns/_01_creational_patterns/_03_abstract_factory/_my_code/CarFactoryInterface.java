package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;


public interface CarFactoryInterface {

    default Car orderCar(String name, String address){
        validate(name, address);
        getOrder(name);
        Car car = makeCar();
        sendCarTo(address ,car);
        return car;
    }

    Car makeCar();

    //private 선언시에는 interface에도 메소드 구현이 가능함.
    private void validate(String name, String address){
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("자동차 이름을 입력하세요");
        }
        if(address == null || address.isBlank()) {
            throw new IllegalArgumentException("주소를 입력하세요");
        }
    }

    private void getOrder(String name){
        System.out.println(name + " 주문이 들어왔습니다. 차를 만들자!");
    }

    private static void sendCarTo(String address, Car car){
        System.out.println(car.getName() + " 제작이 완료됬습니다. 원산지 : " + address );
    }
}
