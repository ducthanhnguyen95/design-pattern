package com.thanhnd.behavioral.template;

public class Main {

    public static void main(String[] args) {
        AuditTrail auditTrail = new AuditTrail();
        var task = new TransferMoneyTask();
        var task2 = new GenerateReportTask();
        task.execute();
        task2.execute();
    }

}
