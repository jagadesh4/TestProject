package com.jaga.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); 
		Car mycar =context.getBean(Car.class);
		mycar.drive();
		
	}

}
