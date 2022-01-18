package com.springdemo;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

//        1 uzkrauti spring konfiguracijos faila-konteineri,kontexta
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

//        2 gauti bean'a is spring konteinerio-contexto
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach1 = context.getBean("myCoach", Coach.class);

//        patikrinti ar beanai yra tie patys

        boolean result = (coach == coach1);

//        atspausdinti rezultata
        System.out.println("Pointing to the same object " + result);
        System.out.println("Memory location for coach " + coach);
        System.out.println("Memory location for coach " + coach1);


//        4 uzdarysime contexta
        context.close();
    }
}
