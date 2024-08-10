package com.thanhnd.creational.factoryMethod.yes.Sharp;

import com.thanhnd.creational.factoryMethod.yes.matcha.Controller;
import com.thanhnd.creational.factoryMethod.yes.matcha.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
