package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qa.service.QuestionService;

@SpringBootApplication
public class Application {
	@Bean
	QuestionService questionService() {
		return new QuestionService();
	}
	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}
	
}
