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
	String PATH_SQUREROOT_OF_SUM_OF_THE_HEIGHEST_THREE_NUMBERS_AND_SUM_OF_SQURE = PATH_VERSION + "/findTheSqureRootOfSumoftheSquresOfHighestThreeNumber";
	
	
}
