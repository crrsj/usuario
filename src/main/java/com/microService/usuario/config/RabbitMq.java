package com.microService.usuario.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class RabbitMq {

	@Bean
	public Jackson2JsonMessageConverter messageConverter() {
		ObjectMapper objectMappre = new ObjectMapper();
		return new Jackson2JsonMessageConverter(objectMappre);
	}
	
}
