package com.thanhnd.behavioral.command.editor;

public interface UndoableCommand extends Command{
    void unexecute();
}
