package com.thanhnd.behavioral.state.yes.atm;

public interface AtmState {

    void enterPin(AtmMachine atm);
    void selectTransaction(AtmMachine atm);
    void withdraw(AtmMachine atm);
}
