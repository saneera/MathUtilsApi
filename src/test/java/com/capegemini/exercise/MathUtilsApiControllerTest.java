package com.capegemini.exercise;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.capegemini.exercise.api.common.Path;
import com.capegemini.exercise.api.controller.impl.MathUtilsApiController;


@RunWith(SpringRunner.class)
@WebMvcTest(MathUtilsApiController.class)
public class MathUtilsApiControllerTest  {

	@Autowired
	private MockMvc mvc;
	
	private static final String RESOURCE_CATEGORY = "mathoperation";
	private static final String RESPONSE_CATEGORY_2XX = "2xx";
	private static final String RESPONSE_CATEGORY_4XX = "4xx";
	
	@Test
	public void testValidInput1() throws Exception {
		String request = JsonHelper.get(RESOURCE_CATEGORY, RESPONSE_CATEGORY_2XX, "valid-request1.json");
		String expectedResponse = JsonHelper.get(RESOURCE_CATEGORY, RESPONSE_CATEGORY_2XX, "successful-response1.json");
		this.mvc.perform(post(getApiOperationPath()).accept(MediaType.APPLICATION_JSON).content(request).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().json(expectedResponse));
	}
	
	@Test
	public void testValidInput2() throws Exception {
		String request = JsonHelper.get(RESOURCE_CATEGORY, RESPONSE_CATEGORY_2XX, "valid-request2.json");
		String expectedResponse = JsonHelper.get(RESOURCE_CATEGORY, RESPONSE_CATEGORY_2XX, "successful-response2.json");
		this.mvc.perform(post(getApiOperationPath()).accept(MediaType.APPLICATION_JSON).content(request).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().json(expectedResponse));
	}
	
	@Test
	public void testValidInput3() throws Exception {
		String request = JsonHelper.get(RESOURCE_CATEGORY, RESPONSE_CATEGORY_2XX, "valid-request3.json");
		String expectedResponse = JsonHelper.get(RESOURCE_CATEGORY, RESPONSE_CATEGORY_2XX, "successful-response3.json");
		this.mvc.perform(post(getApiOperationPath()).accept(MediaType.APPLICATION_JSON).content(request).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().json(expectedResponse));
	}
	
	private String getApiOperationPath() {
		return Path.PATH_SQUREROOT_OF_SUM_OF_THE_HEIGHEST_THREE_NUMBERS_AND_SUM_OF_SQURE;
	}

	
	
}
