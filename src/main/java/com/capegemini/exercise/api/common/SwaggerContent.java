package com.capegemini.exercise.api.common;

/**
 * Contains all information required for generating swagger doc automatically based on the
 * rest controllers<br>
 * Please not that this interface and its inner interfaces are purely information for
 * swagger document generation and should not be used for anything else
 * @author Saneera Yapa
 *
 */
public interface SwaggerContent {

	interface OPERATION {
		String TAG = "FindTheSqureRootOfSumoftheSquresOfHighestThreeNumber";

		interface Get {
			String ID = "findTheSqureRootOfSumoftheSquresOfHighestThreeNumber";
			String DESCRIPTION = "find the squre root of sum of the squres of highest three number";
			String NOTE = "FindTheSqureRootOfSumoftheSquresOfHighestThreeNumber";
		}
	}
	
	
}