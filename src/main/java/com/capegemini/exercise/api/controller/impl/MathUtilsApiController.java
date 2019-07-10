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
import com.capegemini.exercise.api.util.ExceptionHelper;
import com.capegemini.exercise.api.validator.RequestValidator;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class MathUtilsApiController implements MathUtilsAPI {

	
	@Override
	public ResponseEntity<ResponseModel> findTheSqureRootOfSumoftheSquresOfHighestThreeNumber(RequestModel input) throws ApiException {		
	
		try {
			RequestValidator.validateNotNull(input, "data");	
			RequestValidator.validateNotNull(input.getData(), RequestModel.ATTRIBUTE_NAME_DATA);
			RequestValidator.validateLength(input.getData(), RequestModel.ATTRIBUTE_NAME_DATA);		
			return new ResponseEntity<ResponseModel>(calculateSqureRootOfSumoftheSquresOfHighestThreeNumber(input), HttpStatus.OK);			
		} catch (RuntimeException e) {
			log.error("exception while calculating" + e, e);
			throw ExceptionHelper.getApiException(e.getMessage());
		}
				
	}

	
	/**
	 * This method compute the square root of the sum of squares of the 3 highest numeric inputs
	 * @param RequestModel contains int array to do the operation	
	 * @return an ResponseModel
	 */
	private ResponseModel calculateSqureRootOfSumoftheSquresOfHighestThreeNumber(RequestModel input) {
		ResponseModel result = new ResponseModel();
		double calculatedValue = Math.sqrt(Arrays.stream(input.getData()).sorted().skip(input.getData().length-3).mapToLong(i -> i*i).sum());
		BigDecimal bd = new BigDecimal(calculatedValue).setScale(2, RoundingMode.HALF_UP);
        result.setOutput(bd.doubleValue());        
		return result;
	}
	
	
}
