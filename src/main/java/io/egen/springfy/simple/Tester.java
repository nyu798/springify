package io.egen.springfy.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		Hello hello = context.getBean(Hello.class);
		hello.sayHello();
		context.close();
	}

}
