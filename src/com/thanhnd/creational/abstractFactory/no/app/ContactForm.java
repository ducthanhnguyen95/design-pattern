package com.thanhnd.creational.abstractFactory.no.app;

import com.thanhnd.creational.abstractFactory.no.Theme;
import com.thanhnd.creational.abstractFactory.no.ant.AntButton;
import com.thanhnd.creational.abstractFactory.no.ant.AntTextBox;
import com.thanhnd.creational.abstractFactory.no.material.MaterialButton;
import com.thanhnd.creational.abstractFactory.no.material.MaterialTextBox;

public class ContactForm {

    public void render(Theme theme) {
        if (theme == Theme.ANT) {
            new AntTextBox().render();
            new AntButton().render();
        } else if (theme == Theme.MATERIAL) {
            new MaterialTextBox().render();
            new MaterialButton().render();
        }
    }
}
