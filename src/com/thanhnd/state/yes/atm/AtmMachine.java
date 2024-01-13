package com.thanhnd.state.yes.atm;

public class AtmMachine {

    private AtmState currentState;

    public AtmMachine() {
        currentState = new PinEnteredState();
    }

    public void enterPin() {
        currentState.enterPin(this);
    }

    public void selectTransaction() {
        currentState.selectTransaction(this);
    }

    public void withdraw() {
        currentState.withdraw(this);
    }

    public void setCurrentState(AtmState state) {
        currentState = state;
    }
}
