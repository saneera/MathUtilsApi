package com.capegemini.exercise.api.controller.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.capegemini.exercise.api.controller.MathUtilsAPI;
import com.capegemini.exercise.api.exception.ApiException;
import com.capegemini.exercise.api.model.RequestModel;
import com.capegemini.exercise.api.model.ResponseModel;
import com.capegemini.exercise.api.validator.RequestValidator;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class MathUtilsApiController implements MathUtilsAPI {

	@Override
	public ResponseEntity<ResponseModel> findTheSqureRootOfSumoftheSquresOfHighestThreeNumber(RequestModel input) throws ApiException {		
		RequestValidator.validateNotNull(input, "data");	
		RequestValidator.validateNotNull(input.getData(), RequestModel.ATTRIBUTE_NAME_DATA);
		RequestValidator.validateLength(input.getData(), RequestModel.ATTRIBUTE_NAME_DATA);		
		ResponseModel result = new ResponseModel();
		
		double calculatedValue = calculateSqureRootOfSumoftheSquresOfHighestThreeNumber(input);		
		BigDecimal bd = new BigDecimal(calculatedValue).setScale(2, RoundingMode.HALF_UP);
        double output = bd.doubleValue();        
		result.setOutput(output);
		return new ResponseEntity<ResponseModel>(result, HttpStatus.OK);			
	}

	private double calculateSqureRootOfSumoftheSquresOfHighestThreeNumber(RequestModel input) {
		return Math.sqrt(Arrays.stream(input.getData()).sorted().skip(input.getData().length-3).mapToLong(i -> i*i).sum());
	}
	
	
}
