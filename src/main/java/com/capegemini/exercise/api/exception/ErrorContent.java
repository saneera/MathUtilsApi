package com.capegemini.exercise.api.exception;

import com.capegemini.exercise.api.common.MathUtilErrorCode;

/**
 * Interface to hold error information
 * @author Saneera Yapa
 *
 */
public interface ErrorContent {

	/**
	 * Holds generic error information
	 * @author Saneera Yapa
	 *
	 */
	interface Generic {

		/**
		 * Error information for not implemented method errors
		 * @author Saneera Yapa
		 *
		 */
		interface NotImplemented {

			MathUtilErrorCode CODE = MathUtilErrorCode.NOT_IMPLEMENTED_ERROR;
			String TITLE = "Not implemented";
			String message = "Not Implemented";

		}

		/**
		 * Error information for internal errors
		 * @author Saneera Yapa
		 *
		 */
		interface InternalError {
			MathUtilErrorCode CODE = MathUtilErrorCode.INTERNAL_ERROR;
			String TITLE = "An internal error has occurred";
			String message = "Internal Error";

		}

		/**
		 * Error information for invalid inputs
		 * @author Saneera Yapa
		 *
		 */
		interface InvalidInput {
			MathUtilErrorCode CODE = MathUtilErrorCode.INVALID_INPUT;
			String TITLE = "Invalid input(s)";
		}
		
		

	}
}
