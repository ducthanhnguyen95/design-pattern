package com.thanhnd.creational.factory.yes.Sharp;

import com.thanhnd.creational.factory.yes.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Sharp";
    }
}
