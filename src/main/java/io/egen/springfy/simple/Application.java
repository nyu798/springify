package io.egen.springfy.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	
	@Bean
	public Hello getHello() 
	{
		return new Hello("4.5 Release");
	}
}
