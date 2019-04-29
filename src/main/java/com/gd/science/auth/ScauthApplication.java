package com.gd.science.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.gd.science.auth.mapper")
@SpringBootApplication
public class ScauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScauthApplication.class, args);
	}

}
