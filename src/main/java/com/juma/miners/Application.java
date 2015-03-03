package com.juma.miners;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main (String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/beans.xml");
    }

}