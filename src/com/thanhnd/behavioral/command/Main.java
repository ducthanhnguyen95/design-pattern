package com.thanhnd.behavioral.command;

import com.thanhnd.behavioral.command.editor.BoldCommand;
import com.thanhnd.behavioral.command.editor.History;
import com.thanhnd.behavioral.command.editor.HtmlDocument;

public class Main {

//    public static void main(String[] args) {
//        var service = new CustomerService();
//        var command = new AddCustomerCommand(service);
//        var button = new Button(command);
//        button.click();
//    }

//    public static void main(String[] args) {
//        var composite = new CompositeCommand();
//        composite.add(new ResizeCommand());
//        composite.add(new BlackAndWhiteCommand());
//        composite.execute();
//    }

    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");


        var boldCommand = new BoldCommand(document,history);
        boldCommand.execute();
        System.out.println(document.getContent());

        boldCommand.unexecute();
        boldCommand.unexecute();
        System.out.println(document.getContent());
    }
}
