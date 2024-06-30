package com.thanhnd.structural.bridge.yes;

public class Main {
    public static void main(String[] args) {
//        var remoteControl = new RemoteControl(new SonyTV());
//        var remoteControl = new AdvancedRemoteControl(new SonyTV());
//        remoteControl.turnOn();

//      var remoteControl = new RemoteControl(new SamsungTV());
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
    }
}
