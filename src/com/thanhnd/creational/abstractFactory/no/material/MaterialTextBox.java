package com.thanhnd.creational.abstractFactory.no.material;

import com.thanhnd.creational.abstractFactory.no.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
