package com.thanhnd.creational.factoryMethod.yes2;

public class SquareFactory extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
