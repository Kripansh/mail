package com.self.mail.exceptions;

public class MailServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public MailServiceException(String message) {
		super(message);
	}

	public MailServiceException(String message, Throwable cause) {
		super(message, cause);
	}

}
