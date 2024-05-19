package com.thanhnd.behavioral.state.yes.ui;

public abstract class UIControl {
    public void enable() {
        System.out.println("Enable");
    }

    public abstract void draw();
}
