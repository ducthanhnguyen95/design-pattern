package com.thanhnd.creational.factoryMethod.yes.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var engine = new MatchaViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }

}
