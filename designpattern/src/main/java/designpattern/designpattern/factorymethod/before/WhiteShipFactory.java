package designpattern.designpattern.factorymethod.before;

public class WhiteShipFactory extends DefaultShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }

}
