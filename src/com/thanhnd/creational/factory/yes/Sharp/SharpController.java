package com.thanhnd.creational.factory.yes.Sharp;

import com.thanhnd.creational.factory.yes.matcha.Controller;
import com.thanhnd.creational.factory.yes.matcha.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
