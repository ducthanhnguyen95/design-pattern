package com.thanhnd.structural.adapter.no;

import com.thanhnd.structural.adapter.no.avaFilters.Caramel;

public class Main {

    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
//        imageView.apply(new Caramel());
    }
}
