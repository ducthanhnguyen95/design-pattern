package com.thanhnd.creational.factory.no.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var engine = new MatchaViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

}
