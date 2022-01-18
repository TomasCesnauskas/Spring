package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

//        read spring config Java class SportConfig
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

//        get the bean from spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

//        call method of the bean
        System.out.println(coach.getDailyWorkOut());

//        call method to get dayly fortune
        System.out.println(coach.getDaylyFortune());

//        close the context
        context.close();
    }
}
