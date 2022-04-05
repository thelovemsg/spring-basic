package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._again;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteWheel;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.Anchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.Wheel;

public class WhiteshipPartsFactory implements ShipPartsFactory{

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }

}
