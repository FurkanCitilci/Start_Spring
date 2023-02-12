package com.furkancitilci;

public class MessageProviderDe implements IProvider{
    @Override
    public String getMessage() {
        return "Hallo";
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
