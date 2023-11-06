package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PhoneAppApplication {

	public static void main(String[] args) {

		//SpringApplication.run(PhoneAppApplication.class, args);

		//ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SimCard sim1 = appContext.getBean("ATT", SimCard.class);
		sim1.browse();
		sim1.call();

		SimCard sim2 = appContext.getBean("Verizon", SimCard.class);
		sim2.browse();
		sim2.call();

//		SimCard sim3 = appContext.getBean("iPhone", SimCard.class);
//		sim3.browse();
//		sim3.call();

	}

}
