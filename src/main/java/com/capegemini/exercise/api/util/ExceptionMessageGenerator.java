package com.capegemini.exercise.api.util;

/**
 * A utility class used to generate exception messages conforming to a standardized format
 * which will be returned via the api
 * @author Saneera Yapa
 *
 */
public class ExceptionMessageGenerator {

	public static final String VALIDATION_SOURCE_INPUT = "input";
	
	private static final String ERROR_404_INVALID_REQUEST_FORMAT_SINGLE_INVALID_VALUE = "%s [%s] is invalid. reason: [%s]";

	/**
	 * generates a invalid input message
	 * @param validationSource the name of the resource looking for
	 * @param fieldName the field name for validation message
	 * @param validationMessage the validation message
	 * @return a formatted message
	 */
	public static String generateInvalidRequestMessageForInputValues(String validationSource,
			String fieldName, String validationMessage) {
		return String.format(ERROR_404_INVALID_REQUEST_FORMAT_SINGLE_INVALID_VALUE, validationSource,
				fieldName, validationMessage);
	}


}
