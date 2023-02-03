package com.example.northWind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@SpringBootApplication
@EnableWebMvc
public class NorthWindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthWindApplication.class, args);
	}

}
