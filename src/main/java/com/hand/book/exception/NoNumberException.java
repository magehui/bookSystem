package com.hand.book.exception;

@SuppressWarnings("serial")
public class NoNumberException extends RuntimeException {
	public NoNumberException(String message) {
		super(message);
	}

	public NoNumberException(String message, Throwable cause) {
		super(message, cause);
	}
}
