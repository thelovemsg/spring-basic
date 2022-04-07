package me.whiteship.designpatterns._02_structural_patterns._07_bridge._my_code._before;

public class FirstBlackCar implements Car{

    @Override
    public void forward() {
        System.out.println("First - Black Car Move Forward");
    }

    @Override
    public void back() {
        System.out.println("First - Black Car Move Back");
    }

    @Override
    public void left() {
        System.out.println("First - Black Car Move Left");
    }

    @Override
    public void right() {
        System.out.println("First - Black Car Move Right");
    }
}
