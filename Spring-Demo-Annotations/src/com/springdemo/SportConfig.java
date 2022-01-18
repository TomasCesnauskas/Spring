package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:sport.properties", encoding = "UTF-8")
//@ComponentScan("com.springdemo")
public class SportConfig {

//    define bean for our SadFortuneService
    @Bean
    public  FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
//    define bean for our SwimCoach and inject dependecy
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
