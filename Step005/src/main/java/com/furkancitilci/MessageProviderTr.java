package com.furkancitilci;

public class MessageProviderTr implements IProvider{

    @Override
    public String getMessage() {
        return "Merhaba";
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
