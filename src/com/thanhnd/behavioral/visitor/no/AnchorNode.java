package com.thanhnd.behavioral.visitor.no;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("highlight-anchor");
    }
}
