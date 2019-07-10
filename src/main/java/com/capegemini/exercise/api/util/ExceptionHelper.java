package com.capegemini.exercise.api.util;

import com.capegemini.exercise.api.exception.ApiException;
import com.capegemini.exercise.api.exception.ErrorContent;
import com.capegemini.exercise.api.exception.InvalidRequestException;

/**
 * A helper class to generate common exceptions for different scenarios
 * @author Saneera Yapa
 *
 */
public class ExceptionHelper {

	/**
	 * generates a new InvalidRequestException for invalid inputs
	 * @param message the detaild error message
	 * @return an {@link InvalidRequestException} object
	 */
	public static InvalidRequestException getInvalidRequestExceptionForInvalidInput(String message) {
		return new InvalidRequestException(ErrorContent.Generic.InvalidInput.CODE, ErrorContent.Generic.InvalidInput.TITLE, message);
	}

	/**
	 * generates a new ApiException
	 * @param message the detailed error message
	 * @return an {@link ApiException} object
	 */
	public static ApiException getApiException(String message) {
		return new ApiException(ErrorContent.Generic.InternalError.CODE, ErrorContent.Generic.InternalError.TITLE, message);
	}

		

}
