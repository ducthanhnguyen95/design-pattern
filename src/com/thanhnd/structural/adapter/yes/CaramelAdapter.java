package com.thanhnd.structural.adapter.yes;

import com.thanhnd.structural.adapter.yes.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
