package com.thanhnd.state.yes.atm;

public class Main {

    public static void main(String[] args) {
        AtmMachine atm = new AtmMachine();

        // Thực hiện các hành động trong các trạng thái khác nhau
        atm.enterPin();
        atm.selectTransaction();
        atm.withdraw();
        atm.selectTransaction();
        atm.withdraw();
        atm.enterPin();
    }
}
