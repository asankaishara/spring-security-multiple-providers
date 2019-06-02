package org.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootMultipleProvidersApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultipleProvidersApplication.class, args);
	}

}
