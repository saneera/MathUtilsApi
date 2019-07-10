package com.capegemini.exercise.api.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * ApiErrorMessage is used to convert the exceptions to an error message in {@link com.capegemini.api.exception.RestExceptionHandler}
 * @author Saneera Yapa
 *
 */

@Getter @AllArgsConstructor @ToString
@ApiModel
public class ApiErrorMessage {

	@JsonProperty("code")
	@ApiModelProperty(notes = "Error code", position=0)
	private String code;
	
	@JsonProperty("title")
	@ApiModelProperty(notes = "Generic error title", position=1)
	private String title;
	
	@JsonProperty("message")
	@ApiModelProperty(notes = "Detailed error message", position=2)
	private String message;
	
}
