package com.thanhnd.creational.singleton.yes;

public class Main {

    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "thanhnd");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
