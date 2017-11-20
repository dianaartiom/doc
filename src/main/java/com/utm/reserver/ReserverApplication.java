package com.utm.reserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class ReserverApplication extends SpringBootServletInitializer {

		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(ReserverApplication.class);
		}

		public static void main(String[] args) throws Exception {
			SpringApplication.run(ReserverApplication.class, args);
		}

	}