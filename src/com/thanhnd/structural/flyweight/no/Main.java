package com.thanhnd.structural.flyweight.no;

public class Main {

    public static void main(String[] args) {
        var service = new PointService();
        for(var point : service.getPoints())
            point.draw();
    }
}
