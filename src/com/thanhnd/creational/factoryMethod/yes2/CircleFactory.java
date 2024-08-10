package com.thanhnd.creational.factoryMethod.yes2;

public class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
