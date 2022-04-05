package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._my_code;

public class CarFactory {

    public static Car makeCar(String name, String address){
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("자동차 이름을 입력하세요");
        }
        if(address == null || address.isBlank()) {
            throw new IllegalArgumentException("주소를 입력하세요");
        }

        getOrder(name);

        Car car = new Car();
        car.setName(name);

        if (name.equalsIgnoreCase("model1")){
            car.setColor("white");
            car.setPrice(10000);
        } else if(name.equalsIgnoreCase("model2")){
            car.setColor("black");
            car.setPrice(15000);
        }

        sendTextMessageTo(address, car);

        return car;

    }

    private static void getOrder(String name){
        System.out.println(name + " 주문이 들어왔습니다. 차를 만들자!");
    }

    private static void sendTextMessageTo(String address, Car car){
        System.out.println(car.getName() + " 제작이 완료됬습니다. 주소 : " + address + "로 배송 예정");
    }
}
