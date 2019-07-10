package com.capegemini.exercise.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestExceptionHandler {	
	
	
		@ExceptionHandler
		@ResponseStatus(HttpStatus.BAD_REQUEST)
		@ResponseBody
		ResponseEntity<Object> handleException(InvalidRequestException ex) {
			return new ResponseEntity<Object>(new ApiErrorMessage(ex.getCode().getCode(),
					ex.getTitle(), ex.getMessage()), ex.getHttpStatusCode());
		}

		@ExceptionHandler
		@ResponseStatus(HttpStatus.BAD_REQUEST)
		@ResponseBody
		ResponseEntity<Object> handleException(ServletRequestBindingException ex) {

			return new ResponseEntity<Object>(
					new ApiErrorMessage(ErrorContent.Generic.InvalidInput.CODE.getCode(),
							ErrorContent.Generic.InvalidInput.TITLE, ex.getMessage()),
					HttpStatus.BAD_REQUEST);
		}

		@ExceptionHandler
		@ResponseStatus(HttpStatus.NOT_FOUND)
		@ResponseBody
		ResponseEntity<Object> handleException(NotFoundException ex) {
			return new ResponseEntity<Object>(new ApiErrorMessage(ex.getCode().getCode(),
					ex.getTitle(), ex.getMessage()), ex.getHttpStatusCode());
		}
		
		
		@ExceptionHandler
		@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
		@ResponseBody
		ResponseEntity<Object> handleException(ApiException ex) {
			return new ResponseEntity<Object>(
					new ApiErrorMessage(ErrorContent.Generic.InternalError.CODE.getCode(),
							ErrorContent.Generic.InternalError.TITLE,
							ErrorContent.Generic.InternalError.message),
					ex.getHttpStatusCode());
		}

		

}
