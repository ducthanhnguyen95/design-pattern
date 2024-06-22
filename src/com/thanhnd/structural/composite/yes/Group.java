package com.thanhnd.structural.composite.yes;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void render() {
        for (var component : components)
            component.render();
    }

    @Override
    public void move() {
        for (var component : components)
            component.move();
    }
}
