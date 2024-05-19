package com.thanhnd.behavioral.state.no.atm;

public class AtmMachine {
    private boolean pinEntered;
    private boolean transactionSelected;

    public AtmMachine() {
        this.pinEntered = false;
        this.transactionSelected = false;
    }

    public void enterPin() {
        System.out.println("PIN entered");
        pinEntered = true;
    }

    public void selectTransaction() {
        if (pinEntered) {
            System.out.println("Transaction selected");
            transactionSelected = true;
        } else {
            System.out.println("PIN not entered yet");
        }
    }

    public void withdraw() {
        if (transactionSelected) {
            System.out.println("Withdrawal completed");
            resetState();
        } else {
            System.out.println("Transaction not selected yet");
        }
    }

    private void resetState() {
        pinEntered = false;
        transactionSelected = false;
    }
}
