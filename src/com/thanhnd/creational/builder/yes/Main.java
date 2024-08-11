package com.thanhnd.creational.builder.yes;

public class Main {

    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

//        var builder = new PdfDocumentBuilder();
//        presentation.export(builder);
//        builder.getPdfDocument();

        var builder = new MovieBuilder();
        presentation.export(builder);
        builder.getMovie();
    }
}
