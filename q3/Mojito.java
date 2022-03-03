package com.lavanya.spring.basics.springprojecta;

import org.springframework.stereotype.Component;

@Component
public class Mojito implements Brewery{
    public String brew() {
        //Logic for making mojito
        return "Mojito";
    }
}
