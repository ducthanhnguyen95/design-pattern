package com.thanhnd.behavioral.mediator.implementationusingtheobserverpattern;

public class Button extends UIControl {
    private boolean isEnabled;
    public boolean isEnabled() {
        return isEnabled;
    }

    protected void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
