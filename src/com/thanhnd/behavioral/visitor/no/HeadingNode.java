package com.thanhnd.behavioral.visitor.no;

public class HeadingNode implements HtmlNode{
    @Override
    public void highlight() {
        System.out.println("highlight-heading");
    }
}
