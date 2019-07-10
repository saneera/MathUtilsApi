package com.capegemini.exercise.api.exception;

import org.springframework.http.HttpStatus;

import com.capegemini.exercise.api.common.MathUtilErrorCode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;


/**
 * An Exception thrown based of different conditions in the service and it's operations
 * <br>Will be handled by {@link RestExceptionHandler} before responding back to the consumer
 * @author Saneera Yapa
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiException extends Exception{
	
	@Getter
	private HttpStatus httpStatusCode;
	
	@Getter
	private MathUtilErrorCode code;
	
	@Getter
	private String title;
	
	public ApiException (MathUtilErrorCode code, String title, String msg) {
		super(msg);
		this.httpStatusCode = HttpStatus.INTERNAL_SERVER_ERROR;
		this.code = code;
		this.title = title;
		
	}
	
	public ApiException (HttpStatus httpStatusCode, MathUtilErrorCode code, String title, String msg) {
		super(msg);
		this.httpStatusCode = httpStatusCode;
		this.code = code;
		this.title = title;
	}
}
