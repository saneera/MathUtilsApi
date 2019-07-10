package com.capegemini.exercise.api.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.capegemini.exercise.api.exception.ApiErrorMessage;
import com.fasterxml.classmate.TypeResolver;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {    
	
	@Autowired
	private TypeResolver typeResolver;
	
		
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()   
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo())
          .useDefaultResponseMessages(false)
		  .additionalModels(typeResolver.resolve(ApiErrorMessage.class), typeResolver.resolve(String.class));                                           
    }
    
    
        
    private ApiInfo apiInfo() {
	    return new ApiInfo("MathUtils Api @version@",
				    		"MathUtils Api @version@.",
				    		"@version@",
				    		"https://www.capegemini.com.au",
				    		new Contact("MathUtils Api Suport", "https://www.capegemini.com.au", "support@capegemini.com.au"),
				    		"MathUtil",
				    		"https://www.capegemini.com.au", new ArrayList<VendorExtension>());
	}
    
    
}