package com.unifucamp.unifucamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class UnifucampApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnifucampApplication.class, args);
	}
	@GetMapping("/")
	public String index(){
		return "index";
	}
}
