package com.lavanya.spring.basics.springprojecta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectAApplication {

	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		String drinkServed = cafe.serveDrink("Lime");
		System.out.println(drinkServed);
		SpringApplication.run(SpringProjectAApplication.class, args);
	}

}
