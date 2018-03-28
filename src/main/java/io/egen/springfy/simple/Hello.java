package io.egen.springfy.simple;


import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Hello {
	private final String versio;
	
	public Hello(String var) 
	{
		versio = var;
	} 
	public void sayHello() 
	{
		System.out.println("Hello World " + versio);
	}
}
