package com.webdev.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		boolean result = theCoach == alphaCoach;
		System.out.println("Point to the same object? " + result);
		System.out.println("The memory location of theCoachis : " + theCoach);
		System.out.println("The memory location of alphaCoach is: " + alphaCoach);
		context.close();
	}
}
