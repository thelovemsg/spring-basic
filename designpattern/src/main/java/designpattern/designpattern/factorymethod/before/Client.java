package designpattern.designpattern.factorymethod.before;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "thelovemsg@naver.com");
        client.print(new BlackShipFactory(), "black", "thelovemsg1@naver.com");
//        Ship whiteship = new WhiteShipFactory().orderShip("WhiteShip", "thelovemsg@naver.com");
//        System.out.println(whiteship);
//
//        Ship black = new BlackShipFactory().orderShip("black", "thelovemsg@naver.com");
//        System.out.println(black);

    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
