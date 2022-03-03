package com.lavanya.spring.basics.springprojecta;

public class Cafe {

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
