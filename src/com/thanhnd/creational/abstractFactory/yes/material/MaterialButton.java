package com.thanhnd.creational.abstractFactory.yes.material;

import com.thanhnd.creational.abstractFactory.yes.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
