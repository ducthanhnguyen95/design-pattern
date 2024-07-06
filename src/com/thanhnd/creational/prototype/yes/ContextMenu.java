package com.thanhnd.creational.prototype.yes;

public class ContextMenu {

    public void duplicate(Component component) {
        Component newComponent = component.clone();
    }
}
