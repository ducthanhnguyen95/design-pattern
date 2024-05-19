package com.thanhnd.behavioral.state.yes.atm;

public class WithdrawalState implements AtmState {

    @Override
    public void enterPin(AtmMachine atm) {
        System.out.println("PIN already entered");
    }

    @Override
    public void selectTransaction(AtmMachine atm) {
        System.out.println("Transaction already selected");
    }

    @Override
    public void withdraw(AtmMachine atm) {
        System.out.println("Withdrawal completed");
        atm.setCurrentState(new PinEnteredState());
    }
}
