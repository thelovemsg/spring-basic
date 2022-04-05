package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;

//추상 팩토리에서 제공하는 모든 parts들은 일련의 규약을 지키는 제품들을 만드는 Factory가 됨.
public class ModelOneFactory implements CarPartsFactory{

    @Override
    public Frame createFrame() {
        return new ModelOneFrame();
    }

    @Override
    public Airbag createAirbag() {
        return new ModelOneAirbag();
    }

}
