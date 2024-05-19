package com.thanhnd.behavioral.state.yes.atm;

public class PinEnteredState implements AtmState {

    @Override
    public void enterPin(AtmMachine atm) {
        System.out.println("PIN already entered");
    }

    @Override
    public void selectTransaction(AtmMachine atm) {
        System.out.println("Transaction selected");
        atm.setCurrentState(new TransactionSelectionState());
    }

    @Override
    public void withdraw(AtmMachine atm) {
        System.out.println("Cannot withdraw without selecting a transaction");
    }
}
