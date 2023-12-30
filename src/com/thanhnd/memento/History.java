package com.thanhnd.memento;

import java.util.Deque;
import java.util.LinkedList;

public class History {

    private Deque<EditorState> states = new LinkedList<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
         return states.pop();
    }
}
