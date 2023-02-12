package com.furkancitilci;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //spring xml i okumak için yazılan satırdır.
        BeanFactory factory =
                new ClassPathXmlApplicationContext("spring.xml");
        IPrinter printer = factory.getBean("printer",IPrinter.class);
        printer.print();
    }
}