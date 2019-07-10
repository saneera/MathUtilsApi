package com.capegemini.exercise.api.exception;

import org.springframework.http.HttpStatus;

import com.capegemini.exercise.api.common.MathUtilErrorCode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * An Exception thrown when a request is invalid. Extends {@link ApiException}
 * <br>Will be handled by {@link RestExceptionHandler} before responding back to the consumer
 * @author Saneera Yapa
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvalidRequestException extends ApiException{
	
	public InvalidRequestException (MathUtilErrorCode code, String title, String msg) {
		super(HttpStatus.BAD_REQUEST, code, title, msg);
	}
}

