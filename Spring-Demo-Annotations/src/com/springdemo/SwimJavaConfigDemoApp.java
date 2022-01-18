package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

//        read spring config Java class SportConfig
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

//        get the bean from spring container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

//        call method of the bean
        System.out.println(coach.getDailyWorkOut());

//        call method to get dayly fortune
        System.out.println(coach.getDaylyFortune());
//        call our swimcoach new methods, which has the props values injected
        System.out.println("email: " +  coach.getEmail() + "\nteam: " + coach.getTeam());

//        close the context
        context.close();
    }
}
