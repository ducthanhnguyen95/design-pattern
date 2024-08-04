package com.thanhnd.creational.factory.no;

import com.thanhnd.creational.factory.no.matcha.Controller;
import com.thanhnd.creational.factory.no.matcha.MatchaViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listProduct() {
        // Get products from a database
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("products.html", context);
    }
}
