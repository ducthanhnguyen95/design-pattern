package com.thanhnd.creational.factory.yes2;

public abstract class ShapeFactory {
    // Factory Method
    public abstract Shape createShape();

    // Các phương thức khác có thể sử dụng đối tượng được tạo ra
    public void drawShape() {
        Shape shape = createShape();
        shape.draw();
    }
}
