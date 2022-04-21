package com.devsuperior.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	/*Serve para registrar uma instância única, que fica disponível para injetar
	  em outros componentes*/
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
