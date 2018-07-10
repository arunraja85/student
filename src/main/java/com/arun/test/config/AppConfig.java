package com.arun.test.config;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;
/**
 *  @author Arunraja
 *  @Class	AppConfig
 */
@SpringBootConfiguration 
public class AppConfig {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	
	@Bean
	@Scope("prototype")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
