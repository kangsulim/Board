package com.example.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BoardApplication extends SpringBootServletInitializer {	// 배포하려면 상속 달아주면 됨
	
	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}
}
