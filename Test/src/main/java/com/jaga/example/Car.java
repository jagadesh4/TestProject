package com.jaga.example;

public class Car {
	
	private Engine eng;
	public Car(Engine eng)
	{
		System.out.println("Constructor:Car");
		this.eng=eng;
	}
	
	public void drive()
	{
		int start =eng.start();
		if(start==1)
		{
			System.out.println("Journey Started");
		}
		else
		{
			System.out.println("Having some problem with Engine");
		}
		
	}

}