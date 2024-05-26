package com.thanhnd.behavioral.command;

import com.thanhnd.behavioral.command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
