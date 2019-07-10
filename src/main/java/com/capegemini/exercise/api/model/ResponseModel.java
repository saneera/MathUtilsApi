package com.capegemini.exercise.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@ApiModel
public class ResponseModel {

	public static final String ATTRIBUTE_NAME_OUTPUT = "output";

	//@JsonProperty(ATTRIBUTE_NAME_OUTPUT)
	@ApiModelProperty(notes = "The squre root of sum of the squres of highest three numbers", position=0)
	private double output;
}
