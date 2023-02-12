package com.furkancitilci;

public class Main {
    public static void main(String[] args) {
        IPrinter printer =
                MyFramework.INSTANCE
                        .getObjectInstance("com.furkancitilci.MessageProviderTr",
                                "com.furkancitilci.ErrorPrinter");
        printer.print();

    }
}