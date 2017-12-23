package com.self.mail.service;

import com.self.mail.exceptions.MailServiceException;

public interface IMailService {

	public void sendMail(String to, String subjet, String message) throws MailServiceException;

}
