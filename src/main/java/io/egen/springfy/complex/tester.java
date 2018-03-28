package io.egen.springfy.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class tester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		NotificationService service = context.getBean(NotificationService.class);
		service.sendNotification("nj798@nyu.edu", "Let's keep learning");
		context.close();
	}

}
