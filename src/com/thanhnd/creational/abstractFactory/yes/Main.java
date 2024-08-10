package com.thanhnd.creational.abstractFactory.yes;

import com.thanhnd.creational.abstractFactory.yes.ant.AntWidgetFactory;
import com.thanhnd.creational.abstractFactory.yes.app.ContactForm;
import com.thanhnd.creational.abstractFactory.yes.material.MaterialWidgetFactory;

public class Main {

    public static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
        new ContactForm().render(new AntWidgetFactory());
    }
}
