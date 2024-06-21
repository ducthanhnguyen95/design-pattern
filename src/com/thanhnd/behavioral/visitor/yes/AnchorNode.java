package com.thanhnd.behavioral.visitor.yes;

public class AnchorNode implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
