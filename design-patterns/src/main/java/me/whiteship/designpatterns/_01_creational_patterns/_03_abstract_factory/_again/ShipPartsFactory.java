package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._again;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.Anchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.Wheel;

public interface ShipPartsFactory { // 추상 팩토리ㅋ

    Anchor createAnchor();

    Wheel createWheel();

}
