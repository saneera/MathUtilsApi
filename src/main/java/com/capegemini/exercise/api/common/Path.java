package com.capegemini.exercise.api.common;

/**
 * Valid Paths of Controllers exposed by the Service
 * @author Saneera Yapa
 *
 */
public interface Path {

	/**
	 * Version of the controller
	 *
	 */
	String PATH_VERSION = "/v1";
	
		
	/**
	 *find the squre root of sum of the squres of highest three number
	 */
	String PATH_CALCULATION = PATH_VERSION + "/calculate";
	
	
}
