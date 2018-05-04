package com.hand.book.exception;

/**
 * 重复预约异常
 * 
 * @author HAND-gonghao
 *
 */
public class RepeatAppointException extends RuntimeException {
	public RepeatAppointException(String message) {
		super(message);
	}

	public RepeatAppointException(String message, Throwable cause) {
		super(message, cause);
	}
}