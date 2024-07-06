package com.thanhnd.creational.prototype.no;

public class Circle implements Component{

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public void render() {
        System.out.println("Rendering a cirlce");
    }
}
