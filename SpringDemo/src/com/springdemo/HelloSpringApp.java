package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

//        1 uzkrauti spring konfiguracijos faila-konteineri,kontexta
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        2 gauti bean'a is spring konteinerio-contexto
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

//        3 kreipsimes i bean'o metoda
        System.out.println(coach.getDailyWorkOut());
//        iskvieciamas FortuneService metodas
        System.out.println(coach.getDailyFortune());

//        kviesime naujus metodus gauti konkreciom reiksmem
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

//        4 uzdarysime contexta
        context.close();

    }
}
