package com.thanhnd.state.yes.atm;

public class TransactionSelectionState implements AtmState {
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
        System.out.println("Withdrawal in progress");
        atm.setCurrentState(new WithdrawalState());
    }
}
