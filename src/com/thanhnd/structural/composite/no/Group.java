package com.thanhnd.structural.composite.no;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Object> objects = new ArrayList<>();

    public void add(Object shape) {
        objects.add(shape);
    }

    public void render() {
        for (var object : objects)
            if (object instanceof Shape)
                ((Shape) object).render();
            else
                ((Group) object).render();

    }
}
