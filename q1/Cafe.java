package com.lavanya.spring.basics.springprojecta;

public class Cafe {
    public String serveDrink(String flavour){
        //flavor juice
        //flavor mojito
        Juice juice = new Juice();
        String brewedDrink = juice.brew();

        return flavour+" "+brewedDrink+" served, Bottoms Up!!";
    }
}
