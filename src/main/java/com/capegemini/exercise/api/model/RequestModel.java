package com.capegemini.exercise.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@ApiModel
public class RequestModel {
	
	public static final String ATTRIBUTE_NAME_DATA = "data";
	
	@JsonProperty(ATTRIBUTE_NAME_DATA)
	@ApiModelProperty(notes = "Array of integers", position=0)
	private int[] data;

	
}
