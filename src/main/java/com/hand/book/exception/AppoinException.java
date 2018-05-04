package com.hand.book.exception;

@SuppressWarnings("serial")
/**
 * 预约异常
 * @author HAND-14486
 *
 */
public class AppoinException extends RuntimeException{
	public AppoinException(String message) {
		super(message);
	}

	public AppoinException(String message, Throwable cause) {
		super(message, cause);
	}
}
