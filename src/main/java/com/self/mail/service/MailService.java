package com.self.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.self.mail.exceptions.MailServiceException;

@Service
public class MailService implements IMailService {

	@Autowired
	JavaMailSender mailSender;

	@Override
	public void sendMail(String to, String subject, String message) throws MailServiceException {
		try {
			SimpleMailMessage mailMessage = new SimpleMailMessage();
			mailMessage.setTo(to);
			mailMessage.setSubject(subject);
			mailMessage.setText(message);

			mailSender.send(mailMessage);
		} catch (MailException exception) {
			throw new MailServiceException(exception.getMessage(), exception);
		}
	}

}
