package com.thanhnd.creational.abstractFactory.yes.ant;

import com.thanhnd.creational.abstractFactory.yes.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
