package com.thanhnd.creational.abstractFactory.no.ant;

import com.thanhnd.creational.abstractFactory.no.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
