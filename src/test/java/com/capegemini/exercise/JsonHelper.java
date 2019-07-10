package com.capegemini.exercise;

import org.assertj.core.util.Files;
import org.springframework.core.io.ClassPathResource;

public class JsonHelper {

	public static String get(String resourceCategory, String responseCategory, String file) throws Exception{
		return Files.contentOf(new ClassPathResource("json-content/"+resourceCategory+"/"+responseCategory+"/"+file).getFile(), "UTF-8");
	}
	
	public static String getInternalErrorResponse() throws Exception{
		return get("generic", "5xx", "internal-error-response.json");
	}
	
}
