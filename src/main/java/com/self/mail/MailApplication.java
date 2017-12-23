package com.self.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.self.mail.exceptions.MailServiceException;
import com.self.mail.service.IMailService;

@SpringBootApplication
public class MailApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MailApplication.class, args);
		IMailService mailService = context.getBean(IMailService.class);
		try {
			mailService.sendMail("kb.cryptocurrency@gmail.com", "Testing", "Testing Message");
		} catch (MailServiceException e) {
			System.out.println(e);
		}
	}
}
