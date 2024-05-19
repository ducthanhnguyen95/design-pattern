package com.thanhnd.behavioral.state.yes.photoshop;

public class EraseTool implements Tool{

    @Override
    public void mouseUp() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase something");
    }
}
