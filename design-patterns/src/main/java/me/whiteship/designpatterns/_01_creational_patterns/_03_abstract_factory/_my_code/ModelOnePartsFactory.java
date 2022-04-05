package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;

//모든 파트들은 일련의 규약을 통해서 생성된다.
public class ModelOnePartsFactory implements CarPartsFactory {
    @Override
    public Frame createFrame() {
        return new ModelOneFrame();
    }

    @Override
    public Airbag createAirbag() {
        return new ModelOneAirbag();
    }
}
