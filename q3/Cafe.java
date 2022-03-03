package com.lavanya.spring.basics.springprojecta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cafe {
    @Autowired
    private Brewery brewery;

    public Cafe(Brewery brewery){
        this.brewery = brewery;
    }

    public String serveDrink(String flavour){

        //flavor juice
        //flavor mojito
        //Juice juice = new Juice();
        String brewedDrink = brewery.brew();
        System.out.println(brewery);

        return flavour+" "+brewedDrink+" served, Bottoms Up!!";
    }
}
