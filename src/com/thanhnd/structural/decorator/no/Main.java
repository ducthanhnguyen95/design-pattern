package com.thanhnd.structural.decorator.no;

public class Main {

    public static void main(String[] args) {
//        var cloudStream = new CloudStream();
        var cloudStream = new EncryptedCloudStream();
        cloudStream.write("Here's some data");
    }
}
