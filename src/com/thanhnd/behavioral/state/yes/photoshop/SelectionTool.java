package com.thanhnd.behavioral.state.yes.photoshop;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw a rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }
}
