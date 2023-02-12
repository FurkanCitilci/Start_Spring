package com.furkancitilci;

public class Print {

    public void printMessage(MessageType type){

        switch (type){
            case STANDART -> System.out.println("Merhaba");
            case ERROR -> System.err.println("Merhaba");
            //default -> System.out.println("Merhaba");
        }

    }
}
