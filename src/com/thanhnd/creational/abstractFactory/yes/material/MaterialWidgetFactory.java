package com.thanhnd.creational.abstractFactory.yes.material;

import com.thanhnd.creational.abstractFactory.yes.Button;
import com.thanhnd.creational.abstractFactory.yes.TextBox;
import com.thanhnd.creational.abstractFactory.yes.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
