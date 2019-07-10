package com.capegemini.exercise.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capegemini.exercise.api.common.Path;
import com.capegemini.exercise.api.common.SwaggerContent;
import com.capegemini.exercise.api.exception.ApiException;
import com.capegemini.exercise.api.model.RequestModel;
import com.capegemini.exercise.api.model.ResponseModel;
import com.capegemini.exercise.api.util.Constants;

import io.swagger.annotations.ApiOperation;


public interface MathUtilsAPI {
	
	/**
	 * @param RequestModel contains int array to do the operation	
	 * @return an ResponseModel
	 * @throws ApiException
	 */
	@RequestMapping(
			value = Path.PATH_CALCULATION, 
			produces = {Constants.CONTENT_TYPE_APPLICATION_JSON },
			consumes = {Constants.CONTENT_TYPE_APPLICATION_JSON },
			method = RequestMethod.POST)
	@ApiOperation(
			value = SwaggerContent.OPERATION.Get.DESCRIPTION, 
			notes = SwaggerContent.OPERATION.Get.NOTE, 
			tags = SwaggerContent.OPERATION.TAG, 
			nickname = SwaggerContent.OPERATION.Get.ID)
	ResponseEntity<ResponseModel> findTheSqureRootOfSumoftheSquresOfHighestThreeNumber(@RequestBody RequestModel data)throws ApiException;

}
