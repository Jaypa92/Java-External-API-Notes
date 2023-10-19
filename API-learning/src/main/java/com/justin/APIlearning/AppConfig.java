package com.justin.APIlearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/* An AppConfiguration needs to be created giving a Java Bean so that the RestTemplate
 * can be used in the Service*/
@Configuration
public class AppConfig {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
