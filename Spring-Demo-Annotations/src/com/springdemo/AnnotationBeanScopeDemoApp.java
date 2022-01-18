package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

//        read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach1= context.getBean("tennisCoach", Coach.class);

//        palyginsime ar beanai tie patys
        boolean result = (coach == coach1);

//        atspausdinti rezultatus
        System.out.println("Rodome i tapati objekta: " + result);
        System.out.println("Atminties vieta coach objekto: " + coach);
        System.out.println("Atminties vieta coach1 objekto: " + coach1);

//        close the context
        context.close();
    }
}
