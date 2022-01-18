package com.springdemo;

public class BaseballCoach implements Coach {
//    reikes apibrezti private kintamaji priklausomybe
    private FortuneService fortuneService;

//    reikes atlikti priklausomybiu injekcija per konstruktoriu
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut(){
        return "Spend 30 mins on batting practice" ;
    }

    @Override
    public String getDailyFortune() {
//        panaudosim FortuneService gauti fortunai
        return fortuneService.getFortune();
    }
}
