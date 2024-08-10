package com.thanhnd.creational.abstractFactory.yes.ant;

import com.thanhnd.creational.abstractFactory.yes.Button;
import com.thanhnd.creational.abstractFactory.yes.TextBox;
import com.thanhnd.creational.abstractFactory.yes.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
