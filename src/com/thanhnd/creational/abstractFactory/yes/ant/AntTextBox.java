package com.thanhnd.creational.abstractFactory.yes.ant;

import com.thanhnd.creational.abstractFactory.yes.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
