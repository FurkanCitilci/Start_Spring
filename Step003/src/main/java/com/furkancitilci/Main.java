package com.furkancitilci;

public class Main {
    public static void main(String[] args) {
        IProvider provider;
        IPrinter printer;

        provider= new MessageProviderTr();
        printer =new DefaultPrinter();

        printer.setProvider(provider);
        printer.print();
    }
}