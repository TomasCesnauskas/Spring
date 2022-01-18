package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

//        1 uzkrauti spring konfiguracijos faila-konteineri,kontexta
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

//        2 gauti bean'a is spring konteinerio-contexto
        Coach coach = context.getBean("myCoach", Coach.class);
        System.out.println(coach.getDailyWorkOut());

//        4 uzdarysime contexta
        context.close();
    }
}
