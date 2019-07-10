package com.capegemini.exercise.api.validator;

import com.capegemini.exercise.api.exception.InvalidRequestException;
import com.capegemini.exercise.api.util.ExceptionHelper;
import com.capegemini.exercise.api.util.ExceptionMessageGenerator;

/**
 * A utility class used to validate the request
 * @author Saneera Yapa
 *
 */
public class RequestValidator {
	
public static void validateNotNull(Object value, String resourceName) throws InvalidRequestException{
		
	if(null == value){
		throw ExceptionHelper.getInvalidRequestExceptionForInvalidInput(ExceptionMessageGenerator
					.generateInvalidRequestMessageForInputValues(ExceptionMessageGenerator.VALIDATION_SOURCE_INPUT, resourceName, "is required"));
	 }
		
	}

	public static void validateLength(int[] data, String resourceName) throws InvalidRequestException {
		if(data.length <3) {
			throw ExceptionHelper.getInvalidRequestExceptionForInvalidInput(ExceptionMessageGenerator
					.generateInvalidRequestMessageForInputValues(ExceptionMessageGenerator.VALIDATION_SOURCE_INPUT, resourceName, "array length should be 3 or more"));
		}
	}

}
