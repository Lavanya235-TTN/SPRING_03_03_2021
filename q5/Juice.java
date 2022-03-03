package com.lavanya.spring.basics.springprojecta;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Juice implements Brewery{
    public String brew(){
        //Logic for making juice
        return "Juice";
    }
}
