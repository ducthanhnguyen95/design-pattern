package com.thanhnd.behavioral.command;

import com.thanhnd.behavioral.command.fx.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
