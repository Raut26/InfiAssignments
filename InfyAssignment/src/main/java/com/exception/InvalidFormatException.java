package com.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * Customized Exception class
 *
 */
public class InvalidFormatException extends Exception{
	
	
	public InvalidFormatException(String msg)
	{
		super(msg+" (Dot and Spaces are not allow)");
	}
	
	

}
