package com.furkancitilci;

public class MessageProviderEn implements IProvider {
    @Override
    public String getMessage() {
        return "Hello";
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
