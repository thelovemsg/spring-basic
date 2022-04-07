package me.whiteship.designpatterns._02_structural_patterns._07_bridge._my_code._after;

public class DefaultCar implements Car {

    private Color color;

    private String modelName;

    public DefaultCar(Color color, String modelName) {
        this.color = color;
        this.modelName = modelName;
    }

    @Override
    public void forward() {
        System.out.printf("%s - %s Move Forward\n", modelName, color.getColor());
    }

    @Override
    public void back() {
        System.out.printf("%s - %s Move Back\n", modelName, color.getColor());
    }

    @Override
    public void left() {
        System.out.printf("%s - %s Move Left\n", modelName, color.getColor());
    }

    @Override
    public void right() {
        System.out.printf("%s - %s Move Right\n", modelName, color.getColor());
    }
}
