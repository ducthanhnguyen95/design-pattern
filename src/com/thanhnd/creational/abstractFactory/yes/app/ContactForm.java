package com.thanhnd.creational.abstractFactory.yes.app;

import com.thanhnd.creational.abstractFactory.yes.WidgetFactory;

public class ContactForm {

    public void render(WidgetFactory factory) {
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
