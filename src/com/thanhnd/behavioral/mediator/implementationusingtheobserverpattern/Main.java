package com.thanhnd.behavioral.mediator.implementationusingtheobserverpattern;

public class Main {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
