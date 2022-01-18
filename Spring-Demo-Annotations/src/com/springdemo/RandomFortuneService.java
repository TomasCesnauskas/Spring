package com.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

//    create an array of strings
    private String[] data = {
            "Kruopstumas yra kelias i gera sekme.",
            "Kelione yra atlygis.",
        "Miegas raktas i sekme."
};
//    creat a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
//    pick random number from array
        int index = random.nextInt(data.length);
        String fortune = data[index];
        return fortune;
    }
}
