package com.helloworld.how;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context= new FileSystemXmlApplicationContext("beans.xml");
		
		
		Car car = (Car)context.getBean("car");
		car.drive();
		System.out.println(car);
	}

}
