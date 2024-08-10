package com.thanhnd.creational.abstractFactory.no.material;

import com.thanhnd.creational.abstractFactory.no.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
