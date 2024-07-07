package com.thanhnd.creational.singleton.no;

public class Main {

    public static void main(String[] args) {
        ConfigManager manager = new ConfigManager();
        manager.set("name", "thanhnd");

        ConfigManager other = new ConfigManager();
        System.out.println(other.get("name"));
    }
}
