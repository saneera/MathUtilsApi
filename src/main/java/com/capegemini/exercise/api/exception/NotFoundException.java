package com.capegemini.exercise.api.exception;

import org.springframework.http.HttpStatus;

import com.capegemini.exercise.api.common.MathUtilErrorCode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * An Exception thrown when a resource is not found. Extends {@link ApiException}
 * <br>Will be handled by {@link RestExceptionHandler} before responding back to the consumer
 * @author Saneera Yapa
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotFoundException extends ApiException {
	
	public NotFoundException (MathUtilErrorCode code, String title, String msg) {
		super(HttpStatus.NOT_FOUND, code, title, msg);
	}
}
