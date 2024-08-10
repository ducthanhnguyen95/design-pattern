package com.thanhnd.creational.factory.yes2;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory1 = new CircleFactory();
        shapeFactory1.drawShape(); // Kết quả: "Drawing a Circle"

        ShapeFactory shapeFactory2 = new SquareFactory();
        shapeFactory2.drawShape(); // Kết quả: "Drawing a Square"
    }
}
