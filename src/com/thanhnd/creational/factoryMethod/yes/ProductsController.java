package com.thanhnd.creational.factoryMethod.yes;

import com.thanhnd.creational.factoryMethod.yes.matcha.Controller;

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
