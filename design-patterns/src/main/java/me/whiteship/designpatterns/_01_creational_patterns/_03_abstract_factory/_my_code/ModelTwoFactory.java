package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;

public class ModelTwoFactory implements CarPartsFactory{

    @Override
    public Frame createFrame() {
        return new ModelTwoFrame();
    }

    @Override
    public Airbag createAirbag() {
        return new ModelTwoAirbag();
    }

}
