package designpattern.designpattern.factorymethod.before;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);

        Ship ship = createShip(); // <= 사용자 정의 클래스스

       sendEmailTo(email, ship);
        return ship;
    }

    //java 9부터 가능
    /*private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }*/
    void sendEmailTo(String email, Ship ship);


    Ship createShip();

    private void validate(String name, String email){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    };

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

}
