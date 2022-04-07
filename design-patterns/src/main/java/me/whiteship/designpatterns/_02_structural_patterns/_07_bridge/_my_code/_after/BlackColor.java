package me.whiteship.designpatterns._02_structural_patterns._07_bridge._my_code._after;

//다른 계층구조에 영향을 주지 않고 현재 Color만 변경하면 된다.
public class BlackColor implements Color{

    @Override
    public String getColor() {
        return "Black";
    }

}
