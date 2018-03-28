package io.egen.springfy.complex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import io.egen.springfy.complex.email.EmailService;

@Component
public class NotificationService {
	
	@Autowired
	@Qualifier("mailgunVersion")
	private EmailService emailService;
	
	/*public NotificationService(EmailService emailService) 
	{
		this.emailService = emailService;
	}*/
	
	public void sendNotification(String to, String msg) 
	{
		emailService.sentEmail(to, msg);
	}
}
