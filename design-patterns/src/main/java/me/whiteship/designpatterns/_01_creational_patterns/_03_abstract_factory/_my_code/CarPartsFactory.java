package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;

//추상 팩토리(Abstract Factory) 생성
//이를 바탕으로 구체적인 팩토리를 생성함
public interface CarPartsFactory {

    Frame createFrame();

    Airbag createAirbag();

}
