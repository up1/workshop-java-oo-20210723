package com.example.restapi;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GenerateIdService {

    public String getId() {
        Random random = new Random();
        return "XYZ" + random.nextInt(10);
    }

}
