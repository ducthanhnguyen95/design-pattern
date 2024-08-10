package com.thanhnd.creational.factory.yes2;

public class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
