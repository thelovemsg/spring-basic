package me.whiteship.designpatterns._02_structural_patterns._08_composite._my_code_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

    List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }

    @Override
    public String getName() {
        StringBuilder builder = new StringBuilder();
        for (Component component : components) {
            builder.append(component.getName() + " / ");
        }
        return builder.toString();
    }
}
