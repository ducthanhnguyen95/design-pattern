package com.thanhnd.behavioral.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authentication");
        var isValid = request.getUsername() == "admin" && request.getPassword() == "1234";
        return !isValid;
    }
}
