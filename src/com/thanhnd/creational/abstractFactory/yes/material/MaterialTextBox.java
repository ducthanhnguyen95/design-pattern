package com.thanhnd.creational.abstractFactory.yes.material;

import com.thanhnd.creational.abstractFactory.yes.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
