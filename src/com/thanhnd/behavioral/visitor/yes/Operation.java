package com.thanhnd.behavioral.visitor.yes;

public interface Operation {

    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
