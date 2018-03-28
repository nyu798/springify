package io.egen.springfy.complex.email;

import org.springframework.stereotype.Component;

@Component("mailgunVersion")
public class MailgunEmailService implements EmailService{
	
	@Override
	public void sentEmail(String to, String body) 
	{
		System.out.println("AWS Email");
		System.out.println("Sending to :" + to);
		System.out.println("Message" +body);
	}
}
