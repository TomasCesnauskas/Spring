package com.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }

    public TennisCoach() {
        System.out.println("TennisCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkOut() {

        return "Practice your backhand skills";
    }


    @Override
    public String getDaylyFortune() {
        return fortuneService.getFortune();
    }

    //    Apsirasymas "Init" metodo
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TennisCoach: inside of doMyStartupStuff");
    }

    //    Apsirasymas "destroy" metodo
    @PreDestroy
    public void doMyClanupStuff() {
        System.out.println("TennisCoach: inside of doMyClanupStuff");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//        System.out.println("TennisCoach: inside setFortuneService");
//    }
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService){
//        System.out.println("TennisCoach: inside doSomeCrazyStuff method");
//        this.fortuneService = fortuneService;
//    }
}
