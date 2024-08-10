package com.thanhnd.creational.abstractFactory.no.ant;

import com.thanhnd.creational.abstractFactory.no.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
