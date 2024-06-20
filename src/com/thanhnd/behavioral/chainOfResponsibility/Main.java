package com.thanhnd.behavioral.chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        // authenticator -> logger -> compressor
        var encryptor = new Encryptor(null);
        var compressor = new Compressor(encryptor);
//        var logger = new Logger(compressor);
//        var authentication = new Authenticator(logger);
        var authentication = new Authenticator(compressor);
        var server = new WebServer(authentication);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
