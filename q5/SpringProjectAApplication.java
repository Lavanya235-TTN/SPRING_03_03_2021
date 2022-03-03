package com.lavanya.spring.basics.springprojecta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectAApplication {

	public static void main(String[] args) {
//		Cafe cafe = new Cafe(new Mojito()/*new Juice()*/);

		ApplicationContext applicationContext =
				SpringApplication.run(SpringProjectAApplication.class, args);
		Cafe cafe = applicationContext.getBean(Cafe.class);
		String drinkServed = cafe.serveDrink("Lime");
		System.out.println(drinkServed);
	}

}
